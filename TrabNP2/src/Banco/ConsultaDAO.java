/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import GUI.DiagnosticoGUI;
import GUI.FarmaciaGUI;
import Objetos.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import GUI.ListarConsultaGUI;
import net.proteanit.sql.DbUtils;
import Objetos.Paciente;
import GUI.NovaConsultaGUI;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class ConsultaDAO {

    private Connection con;

    public ConsultaDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return this.con;
    }

    public String novaConsulta(Consulta consulta, Paciente paciente) {
        try {
            String sql = "insert into consulta (cartao_sus_pacientes, data, cstatus, urgencia) values (?, CURDATE(), ?, ?);";
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, paciente.getCartaoSUS());
            ps.setInt(2, consulta.getSituacao());
            ps.setInt(3, consulta.getUrgente());

            ps.executeUpdate();

        } catch (SQLException e) {
            return e.getMessage();
        }

        return null;

    }

    public String retornaPaciente(Paciente paciente) {
        try {
            String sql = "SELECT nome, rg, nascimento FROM pacientes WHERE cartao_sus = ? ";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs;
            ps.setString(1, paciente.getCartaoSUS());
            rs = ps.executeQuery(); //EXECUTA A LINHA DO SQL E PEGA OS RESULTADOS

            //PEGA OS DADOS QUE FORAM RETORNADOS PELA TABELA
            if (rs.next()) {
                NovaConsultaGUI.txtNome.setText(rs.getString("nome"));
                NovaConsultaGUI.txtRG.setText(rs.getString("rg"));
                NovaConsultaGUI.txtDataNascimento.setText(rs.getString("nascimento"));
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
        return null;
    }

    public void mostrarTudo() {

        String sql = "SELECT p.nome AS 'Nome', c.urgencia AS 'Urgência', c.id AS 'Nº da Consulta', c.cstatus AS 'Status' FROM pacientes p, consulta c WHERE p.cartao_sus = c.cartao_sus_pacientes;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void buscarPeloNumConsulta(int nConsulta) {

        String sql = "SELECT p.nome AS 'Nome', c.urgencia AS 'Urgência', c.id AS 'Nº da Consulta', c.cstatus AS 'Status' FROM pacientes p, consulta c WHERE c.id = ? AND p.cartao_sus = c.cartao_sus_pacientes;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setInt(1, nConsulta);
            ResultSet rs = ps.executeQuery();
            ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarPelaData(Date data) {

        String sql = "SELECT p.nome AS 'Nome', c.urgencia AS 'Urgência', c.id AS 'Nº da Consulta', c.cstatus AS 'Status' FROM pacientes p, consulta c WHERE c.data = ? AND p.cartao_sus = c.cartao_sus_pacientes;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setDate(1, data);
            ResultSet rs = ps.executeQuery();
            ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarHistoricoMedico(String crm) {

        String sql = "SELECT c.id AS 'Nº da Consulta',p.nome AS 'Nome', c.data AS 'Data', c.diagnostico AS 'Diagnóstico' FROM pacientes p, consulta c, medicos m WHERE p.cartao_sus = c.cartao_sus_pacientes AND c.crm_medico = m.crm AND m.crm = ? ORDER BY c.id DESC;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, crm);
            ResultSet rs = ps.executeQuery();

            GUI.MedicoGUI.tblHistorico.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void buscarPeloCartaoSUSFarmacia(String cartaoSus) {
        String sql = "SELECT p.nome AS 'Nome', c.id AS 'Consulta Nº', c.data AS 'Data', c.diagnostico AS 'Diagnóstico' FROM pacientes p, consulta c WHERE p.cartao_sus = ? AND p.cartao_sus = c.cartao_sus_pacientes AND c.cstatus = 0 ORDER BY c.id DESC;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, cartaoSus);
            ResultSet rs = ps.executeQuery();
            FarmaciaGUI.tblReceitas.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarReceitaFarmacia(int nConsulta) {
        String sql = "SELECT c.receita FROM consulta c WHERE c.id = ?;";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setInt(1, nConsulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())         
            JOptionPane.showMessageDialog(null, rs.getString("receita"));
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void melhorConsulta() {
        String sql;
        sql = "SELECT c.id, p.nome,p.cartao_sus,p.nascimento FROM consulta c, pacientes p "
                + "WHERE c.cartao_sus_pacientes = p.cartao_sus AND c.cstatus = 2 "
                + "ORDER BY c.id AND c.urgencia;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            rs.next();

            DiagnosticoGUI.idConsulta = rs.getInt(1);
            DiagnosticoGUI.txtNome.setText(rs.getString(2));
            DiagnosticoGUI.txtCartaoSUS.setText(rs.getString(3));
            DiagnosticoGUI.txtIdade.setText(rs.getString(4));

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    public void finalizarConsulta(int id, String diagnostico, String receita) {
        String sql = "UPDATE consulta SET cstatus=0, diagnostico= '" + diagnostico + "', receita = '" + receita + "' WHERE id = " + id + ";";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void emAndamentoConsulta(int id, String crm) {
        String sql = "UPDATE consulta SET cstatus=1, crm_medico='" + crm + "' WHERE id = ?;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

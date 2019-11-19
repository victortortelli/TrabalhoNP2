/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

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

/**
 *
 * @author guilherme
 */
public class ConsultaDAO extends DAO {

    public ConsultaDAO(Connection con) {
        super(con);
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

    public Consulta buscarPaciente(String cartaoSUS) {
        String sql = "SELECT p.nome,p.rg,p.dataNasc,MAX(c.id) FROM paciente p, consulta c WHERE p.cartaoSUS = ?;";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, cartaoSUS);

            ResultSet rs = ps.executeQuery();

            Consulta c = new Consulta();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    public void mostrarTudo() {

        String sql = "SELECT p.nome AS 'Nome', c.urgencia AS 'Urgência', c.id AS 'Nº da Consulta', c.cstatus AS 'Status' FROM pacientes p, consulta c WHERE p.cartao_sus = c.cartao_sus_pacientes;";
        System.out.println(sql);
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
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

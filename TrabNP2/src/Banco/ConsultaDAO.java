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

/**
 *
 * @author guilherme
 */
public class ConsultaDAO extends DAO {

    public ConsultaDAO(Connection con) {
        super(con);
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

    public void listarConsultas(Consulta consulta) {
        if (ListarConsultaGUI.txtDataConsulta.getText().startsWith(" ") == true && ListarConsultaGUI.txtNumeroConsulta.getText().isBlank() == true) {
            String sql = "SELECT * FROM consulta;";
            try {
                PreparedStatement ps = this.getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (ListarConsultaGUI.txtDataConsulta.getText().startsWith(" ") == false && ListarConsultaGUI.txtNumeroConsulta.getText().isBlank() == true) {
            String sql = "SELECT * FROM consulta WHERE data_consulta = ?";
            try {
                PreparedStatement ps = this.getCon().prepareStatement(sql);
                ps.setDate(1, consulta.getData());
                ResultSet rs = ps.executeQuery();
                ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        else if(ListarConsultaGUI.txtDataConsulta.getText().startsWith(" ") == true && ListarConsultaGUI.txtNumeroConsulta.getText().isBlank() == false){
            String sql = "SELECT * FROM consulta WHERE id = ?";
            try {
                PreparedStatement ps = this.getCon().prepareStatement(sql);
                ps.setInt(1, consulta.getNumero());
                ResultSet rs = ps.executeQuery();
                ListarConsultaGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public String deletarConsulta(Consulta consulta){
        String sql = "DELETE FROM consulta WHERE id = ?";
        try{
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setInt(1, consulta.getNumero());

        }
        catch(SQLException e){
             System.out.println(e.getMessage());
        }
        
        return null;
        
    }

}

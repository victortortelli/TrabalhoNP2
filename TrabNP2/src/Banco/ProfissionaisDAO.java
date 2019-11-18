/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilh
 */
public class ProfissionaisDAO {

    private Connection con;

    public ProfissionaisDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return this.con;
    }

    /**
     *
     * @param cpf
     * @return
     */
    public String buscarNome(String cpf) {
        String nome;

        try {
            String sql = "SELECT nome FROM profissionais WHERE cpf = ? ";

            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs;
            rs = ps.executeQuery(); //EXECUTA A LINHA DO SQL E PEGA OS RESULTADOS
            rs.next();
            nome = rs.getString(1);
        } catch (SQLException e) {
            nome = "ERRO!";
            System.out.println(e.getMessage());
        }

        return nome;
    }

    public String buscarCargo(String cpf) {
        String cargo;

        try {
            String sql = "SELECT cargo FROM profissionais WHERE cpf = ? ";

            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs;
            rs = ps.executeQuery(); //EXECUTA A LINHA DO SQL E PEGA OS RESULTADOS
            rs.next();
            cargo = rs.getString(1);
        } catch (SQLException e) {
            cargo = "ERRO!";
            System.out.println(e.getMessage());
        }

        return cargo;
    }

    public String buscarCrm(String cpf) {
        String crm;

        try {
            String sql = "SELECT id FROM profissionais WHERE cpf = ? ";

            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet rs;
            rs = ps.executeQuery();

            //EXECUTA A LINHA DO SQL E PEGA OS RESULTADOS
            rs.next();
            int id = rs.getInt(1);            
            

            sql = "SELECT crm FROM medicos WHERE id_profissionais = "+ id;
            PreparedStatement psCRM = this.getCon().prepareStatement(sql);           

            ResultSet rsCRM = psCRM.executeQuery();
            rsCRM.next();
            crm = rsCRM.getString(1);

        } catch (SQLException e) {
            crm = "ERRO!";
            System.out.println(e.getMessage());
        }

        return crm;
    }
}

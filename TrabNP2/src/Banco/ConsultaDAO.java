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

/**
 *
 * @author guilherme
 */
public class ConsultaDAO extends DAO{
    
    public ConsultaDAO(Connection con) {
        super(con);
    }
    
    public Consulta buscarPaciente(String cartaoSUS){
        String sql = "SELECT p.nome,p.rg,p.dataNasc,MAX(c.id) FROM paciente p, consulta c WHERE p.cartaoSUS = ?;";
        try{
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, cartaoSUS);
            
            ResultSet rs = ps.executeQuery();
            
            Consulta c = new Consulta();
            
            
        }catch(Exception e){
            
        }
        return null;
    }
    
}

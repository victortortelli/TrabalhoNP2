/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Objetos.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class PacienteDAO {
        private Connection con;

    public PacienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return this.con;
    }

    public String insert(Paciente paciente) {
        String sql = "INSERT INTO paciente(nome,nascimento,cpf,cartao_sus,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,escola) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setDate(2, paciente.getDataNasc());
            ps.setString(3, paciente.getCpf());
            ps.setString(4, paciente.getCartaoSUS());
            ps.setString(5, paciente.getRg());
            ps.setString(6, paciente.getEndereco());
            ps.setString(7, paciente.getBairro());
            ps.setString(8, paciente.getNumero());
            ps.setString(9, paciente.getComplemento());
            ps.setString(10, paciente.getCidade());
            ps.setString(11, paciente.getEstado());
            ps.setString(12, paciente.getDdd());
            ps.setString(13, paciente.getTelefone());
            ps.setString(14, paciente.getEscola());
            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso! (cpf,nome,cartaoSUS)";
            } else {
                return "Erro ao inserir (cpf,nome,cartaoSUS)";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String update(Paciente paciente) {
        String sql = "UPDATE paciente SET cpf = ?, nome = ?, WHERE cartaosus = ?";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, paciente.getCpf());
            ps.setString(2, paciente.getNome());
            ps.setString(3, paciente.getCartaoSUS());
            if (ps.executeUpdate() > 0) {
                return "Dado atualizado com sucesso! (cpf e nome)";
            } else {
                return "Erro ao atualizar (cpf e nome)";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String delete(Paciente paciente) {
        String sql = "DELETE FROM paciente WHERE cartaosus = ?";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, paciente.getCartaoSUS());
            if (ps.executeUpdate() > 0) {
                return "Paciente deletado com sucesso!";
            } else {
                return "Erro ao deletar paciente";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Paciente> selectAll() {
        List<Paciente> collection = new ArrayList<Paciente>();
        String sql = "SELECT * FROM paciente;";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Paciente pb = new Paciente();
                    pb.setCartaoSUS(rs.getString(1));
                    pb.setCpf(rs.getString(2));
                    pb.setNome(rs.getString(3));
                    collection.add(pb);
                }
                return collection;
            }else{
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

        
    }
}
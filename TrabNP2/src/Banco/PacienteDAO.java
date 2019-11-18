/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import GUI.ListarUsuariosGUI;
import Objetos.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

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
        String sql = "INSERT INTO pacientes(cartao_sus,nome,cpf,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,escola) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getCartaoSUS());
            ps.setString(2, paciente.getNome());
            ps.setString(3, paciente.getCpf());
            ps.setDate(4, paciente.getDataNascMysql());
            ps.setString(5, paciente.getCor());
            ps.setString(6, paciente.getDificiencia());
            ps.setString(7, paciente.getSexo());
            ps.setString(8, paciente.getRg());
            ps.setString(9, paciente.getEndereco());
            ps.setString(10, paciente.getBairro());
            ps.setString(11, paciente.getNumero());
            ps.setString(12, paciente.getComplemento());
            ps.setString(13, paciente.getCidade());
            ps.setString(14, paciente.getEstado());
            ps.setString(15, paciente.getDdd());
            ps.setString(16, paciente.getTelefone());
            ps.setString(17, paciente.getEscola());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
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

    public void buscarPeloNome(Paciente pp, String nome) {

        String sql = "SELECT nome AS 'Nome', rg AS 'RG', cartao_sus AS 'Nº Cartão SUS' FROM pacientes WHERE nome LIKE \'" + nome + "%';";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ListarUsuariosGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarPeloCartaoSUS(Paciente pp, String cartaosus) {

        String sql = "SELECT nome AS 'Nome', rg AS 'RG', cartao_sus AS 'Nº Cartão SUS' FROM pacientes WHERE cartao_sus = '" + cartaosus + "';";
        System.out.println(sql);
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ListarUsuariosGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarPeloRg(Paciente pp, String rg) {

        String sql = "SELECT nome AS 'Nome', rg AS 'RG', cartao_sus AS 'Nº Cartão SUS' FROM pacientes WHERE rg = '" + rg + "';";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ListarUsuariosGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarTodos(Paciente pp) {

        String sql = "SELECT nome AS 'Nome', rg AS 'RG', cartao_sus AS 'Nº Cartão SUS' FROM pacientes;";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ListarUsuariosGUI.tblResultados.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

}

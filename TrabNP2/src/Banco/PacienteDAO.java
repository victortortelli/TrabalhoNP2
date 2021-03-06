/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import GUI.ListarUsuariosGUI;
import GUI.InfoPacienteGUI;
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
        String sql = "INSERT INTO pacientes(cartao_sus,nome,cpf,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,escola,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(18, paciente.getNaturalidade());
            ps.setString(19, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemCPF(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,escola,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getCartaoSUS());
            ps.setString(2, paciente.getNome());
            ps.setDate(3, paciente.getDataNascMysql());
            ps.setString(4, paciente.getCor());
            ps.setString(5, paciente.getDificiencia());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getRg());
            ps.setString(8, paciente.getEndereco());
            ps.setString(9, paciente.getBairro());
            ps.setString(10, paciente.getNumero());
            ps.setString(11, paciente.getComplemento());
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setString(14, paciente.getDdd());
            ps.setString(15, paciente.getTelefone());
            ps.setString(16, paciente.getEscola());
            ps.setString(17, paciente.getNaturalidade());
            ps.setString(18, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemComplemento(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,cpf,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,cidade,estado,ddd,telefone,escola,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setString(14, paciente.getDdd());
            ps.setString(15, paciente.getTelefone());
            ps.setString(16, paciente.getEscola());
            ps.setString(17, paciente.getNaturalidade());
            ps.setString(18, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemEscola(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,cpf,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(17, paciente.getNaturalidade());
            ps.setString(18, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemCPFeComplemento(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,cidade,estado,ddd,telefone,escola,naturaliade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getCartaoSUS());
            ps.setString(2, paciente.getNome());

            ps.setDate(3, paciente.getDataNascMysql());
            ps.setString(4, paciente.getCor());
            ps.setString(5, paciente.getDificiencia());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getRg());
            ps.setString(8, paciente.getEndereco());
            ps.setString(9, paciente.getBairro());
            ps.setString(10, paciente.getNumero());
            ps.setString(11, paciente.getCidade());
            ps.setString(12, paciente.getEstado());
            ps.setString(13, paciente.getDdd());
            ps.setString(14, paciente.getTelefone());
            ps.setString(15, paciente.getEscola());
            ps.setString(17, paciente.getNaturalidade());
            ps.setString(18, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemCPFeEscola(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,complemento,cidade,estado,ddd,telefone,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getCartaoSUS());
            ps.setString(2, paciente.getNome());

            ps.setDate(3, paciente.getDataNascMysql());
            ps.setString(4, paciente.getCor());
            ps.setString(5, paciente.getDificiencia());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getRg());
            ps.setString(8, paciente.getEndereco());
            ps.setString(9, paciente.getBairro());
            ps.setString(10, paciente.getNumero());
            ps.setString(11, paciente.getComplemento());
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setString(14, paciente.getDdd());
            ps.setString(15, paciente.getTelefone());
            ps.setString(16, paciente.getNaturalidade());
            ps.setString(17, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemComplementoeEscola(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,cpf,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,cidade,estado,ddd,telefone,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setString(14, paciente.getDdd());
            ps.setString(15, paciente.getTelefone());
            ps.setString(16, paciente.getNaturalidade());
            ps.setString(17, paciente.getProfissao());

            if (ps.executeUpdate() > 0) {
                return "Dados inseridos com sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String cadastroSemComplementoeEscolaeCPF(Paciente paciente) {
        String sql = "INSERT INTO pacientes(cartao_sus,nome,nascimento,cor,deficiencia,sexo,rg,rua,bairro,numero,cidade,estado,ddd,telefone,naturalidade,profissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, paciente.getCartaoSUS());
            ps.setString(2, paciente.getNome());
            ps.setDate(3, paciente.getDataNascMysql());
            ps.setString(4, paciente.getCor());
            ps.setString(5, paciente.getDificiencia());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getRg());
            ps.setString(8, paciente.getEndereco());
            ps.setString(9, paciente.getBairro());
            ps.setString(10, paciente.getNumero());
            ps.setString(11, paciente.getCidade());
            ps.setString(12, paciente.getEstado());
            ps.setString(13, paciente.getDdd());
            ps.setString(14, paciente.getTelefone());
            ps.setString(15, paciente.getNaturalidade());
            ps.setString(16, paciente.getProfissao());

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
        String sql = "UPDATE pacientes SET nome = ?, cpf = ?, nascimento = ?, cor = ?, deficiencia = ?, sexo = ?, rg = ?, rua = ?, bairro = ?, numero = ?, complemento = ?, cidade = ?, estado = ?, ddd = ?, telefone = ?, escola = ?, naturalidade = ?, profissao = ? WHERE cartao_sus = ?";
        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);

            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setDate(3, paciente.getDataNascMysql());
            ps.setString(4, paciente.getCor());
            ps.setString(5, paciente.getDificiencia());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getRg());
            ps.setString(8, paciente.getEndereco());
            ps.setString(9, paciente.getBairro());
            ps.setString(10, paciente.getNumero());
            ps.setString(11, paciente.getComplemento());
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setString(14, paciente.getDdd());
            ps.setString(15, paciente.getTelefone());
            ps.setString(16, paciente.getEscola());
            ps.setString(17, paciente.getNaturalidade());
            ps.setString(18, paciente.getProfissao());
            ps.setString(19, paciente.getCartaoSUS());
            
            

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
    
    private String corrigirData(String data){
        String dataCorrigida="";
        String dia="";
        String mes="";
        String ano="";
        
        char datac[] = data.toCharArray();
        
        int i=0;
        int anterior=i;
        while(Character.isDigit(datac[i])){
            i++;
        }       
        for(int j=anterior;j<i;j++){
            ano+=datac[j];
        }        
        
        while(!Character.isDigit(datac[i])){
            i++;
        }
        anterior=i;
        while(Character.isDigit(datac[i])){
            i++;
        }
        for(int j=anterior;j<i;j++){
            mes+=datac[j];
        }
        
        while(!Character.isDigit(datac[i])){
            i++;
        }
        anterior=i;
        while(Character.isDigit(datac[i])&&i<datac.length-1){
            i++;
        }
        for(int j=anterior;j<=i;j++){
            dia+=datac[j];
        }
        
        if(dia.length()==1){
            String aux = dia;
            dia="0";
            dia+=aux;
        }
        
        
        dataCorrigida+=dia;
        dataCorrigida+="/";
        dataCorrigida+=mes;
        dataCorrigida+="/";
        dataCorrigida+=ano;
        
        return dataCorrigida;
    }

    public String retornaInfoPacienteGUI(String cartaoSus) {
        try {
            String sql = "SELECT * FROM pacientes WHERE cartao_sus = ?;";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, cartaoSus);
            ResultSet rs;
            rs = ps.executeQuery(); //EXECUTA A LINHA DO SQL E PEGA OS RESULTADOS

            //PEGA OS DADOS QUE FORAM RETORNADOS PELA TABELA
            if (rs.next()) {

                InfoPacienteGUI.txtCartaoSus.setText(rs.getString("cartao_sus"));
                InfoPacienteGUI.txtNome.setText(rs.getString("nome"));
                InfoPacienteGUI.txtCpf.setText(rs.getString("cpf"));
                String data = rs.getString("nascimento");               
                InfoPacienteGUI.txtDataNascimento.setText(corrigirData(data));
                InfoPacienteGUI.cmbRaca.setSelectedItem(rs.getString("cor"));
                InfoPacienteGUI.cmbDeficiencia.setSelectedItem(rs.getString("deficiencia"));
                if (rs.getString("sexo").equals("Masculino")) {
                    InfoPacienteGUI.radioMasculino.setSelected(true);
                } else if (rs.getString("sexo").equals("Feminino")) {
                    InfoPacienteGUI.radioFeminino.setSelected(true);
                }
                InfoPacienteGUI.txtRg.setText(rs.getString("rg"));
                InfoPacienteGUI.txtRua.setText(rs.getString("rua"));
                InfoPacienteGUI.txtBairro.setText(rs.getString("bairro"));
                InfoPacienteGUI.txtNumero.setText(rs.getString("numero"));
                InfoPacienteGUI.txtComplemento.setText(rs.getString("complemento"));
                InfoPacienteGUI.txtCidade.setText(rs.getString("cidade"));
                InfoPacienteGUI.cmbEstado.setSelectedItem(rs.getString("estado"));
                InfoPacienteGUI.txtTelefone.setText(rs.getString("telefone"));
                InfoPacienteGUI.txtEscola.setText(rs.getString("escola"));
                InfoPacienteGUI.txtNaturalidade.setText(rs.getString("naturalidade"));
                InfoPacienteGUI.txtProfissao.setText(rs.getString("profissao"));
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
        return null;

    }
}

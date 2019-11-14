package Banco;

import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import GUI.FarmaciaGUI;

public class FarmaciaDAO {

    private Connection con;

    public FarmaciaDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return this.con;
    }

    public String selectAll() {
        String sql = "SELECT d.receitas FROM diagnostico d, paciente p WHERE p.id = d.id AND p.cartao_sus = ? ";

        try {
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, FarmaciaGUI.txtCartaoSUS.getText());
            
            ResultSet rs = ps.executeQuery();
            FarmaciaGUI.tblReceitas.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;

    }
}

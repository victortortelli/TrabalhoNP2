package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guilherme
 */
public class Conexao {
    // -- MUDAR AQUI
    public static final String ip = "localhost";
    public static final String login = "root";
    public static final String senha = "root";
    
    public static Connection abrirConexao() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Drive").newInstance();
            String url ="";
            url+="jdbc:mysql://";
            url+=ip;
            url+="/projeto_java?";
            url+="user=";
            url+=login;
            url+="&password=";
            url+=senha;
            
            con = DriverManager.getConnection(url);
            
            System.out.println("Conexão aberta para " + login);       
            
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    
    public static void fecharConexao(Connection con){
        try{
            con.close();
            System.out.println("Conexão fechada para "+ login);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

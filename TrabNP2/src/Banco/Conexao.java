package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guilherme
 */
public class Conexao {
    // -- MUDAR AQUI SE NECESSARIO
    public static final String ip = "127.0.0.1";
    public static  String login = "";
    public static  String senha = "";
    
    public static Connection abrirConexao() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection con = null;
        
        try{
            System.out.println("Conectando ao banco ...");
            Class.forName("com.mysql.jdbc.Driver").newInstance();         
            String url ="";
            url+="jdbc:mysql://";
            url+=ip;
            url+="/trabalhoNp2?";
            url+="allowPublicKeyRetrieval=true&";
            url+="useSSL=false&";
            url+="user=";
            url+=login;
            url+="&password=";
            url+=senha;
            
            con = DriverManager.getConnection(url);
            
            System.out.println("Conexão aberta para " + login);       
            
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println("Falhou!");
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

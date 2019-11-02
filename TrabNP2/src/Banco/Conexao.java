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
    public static final String ip = "localhost";
    public static final String login = "root";
    public static final String senha = "root";
    
    public static Connection abrirConexao() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection con = null;
        
        try{
            System.out.println("Conectando ao banco ...");
            Class.forName("com.mysql.jdbc.Driver").newInstance();//precisa arrumar essa merda            
            String url ="";
            url+="jdbc:mysql://";
            url+=ip;
            url+="/trabalhoNp2?";
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

package classes_banco;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author maria
 */
public class Conexao_db {
    
    private static Connection con = null;
	
    public static Connection Conectar() throws IOException {
	if (con == null) {
            try {
		Properties props = loadProperties();
		String url = props.getProperty("dburl");
		con = DriverManager.getConnection(url, props);
                System.out.println("Banco de dados conectado!");
            }
            catch (SQLException e) {
		throw new DbException(e.getMessage());
            }
	}
	return con;
    }
	
 
    public static void Desconectar() {
	if (con != null) {
            try {
                System.out.println("Banco de dados desconectado!");
		con.close();
            } catch (SQLException e) {
		throw new DbException(e.getMessage());
            }
	}
    }
	
    private static Properties loadProperties() throws IOException {
	try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
	}
	catch (IOException e) {
            throw new DbException(e.getMessage());
	}
    }

    
//    public void Conectar(){
//        con  = getConectar();
//    }
//    
//    public void Desconectar(){
//         con  = getDesconectar();
//         
//    }
}       
        
        
        
//    private Connection conexao;
//    public Conexao_db() {
//       
//       String url = props.getProperty("dburl");
//    }
    
//    
////    private final String url; 
////    
//////Editar os dados de entrada do banco
////    private final String user = "admin";
////    private final String password = "Bd_M15Ql";
////
////    public Conexao_db() {
////        this.url = "jdbc:mysql://localhost:3306/Library";
////    }
//////Fim editar
//    
//    



package classes_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class Conexao_db {
    private Connection conexao;

    private final String url; 
    
//Editar os dados de entrada do banco
    private final String user = "postgres";
    private final String password = "123456";

    public Conexao_db() {
        this.url = "jdbc:postgresql://localhost:5432/ProntuarioEletronico";
    }
//Fim editar
    
    
    public Connection Conectar(){
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
           System.out.println("Erro ao conectar ao banco de dados!"+ex.toString());
           return null;
        }
     System.out.println("Banco de dados conectado!");
        return conexao;
    }
    
    public void Desconectar(){
        try {
            if (conexao.isClosed()==false){
                conexao.close();
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar ao banco de dados!"+ ex.toString());         
        }
         System.out.println("Banco de dados desconectado!");
    }
}

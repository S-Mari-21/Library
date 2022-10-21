package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
  * @author maria
 */
public class Editora {

    
    public void AddEditora(Connection con, Integer Id_Editora, String Nome_Editora, Integer Ano_Fundacao, String Descricao) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Editora);
        stmt.setString(2, Nome_Editora);
        stmt.setInt(3, Ano_Fundacao);
        stmt.setString(4, Descricao);
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltEditora(Connection con, Integer Id_Editora, String Nome_Editora, Integer Ano_Fundacao, String Descricao) throws SQLException, ParseException{
        String sql = "update medico set nome = ?, cpf = ?, email = ?, numcelular = ?, datanascimento = ?, senha = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Editora);
        stmt.setString(2, Nome_Editora);
        stmt.setInt(3, Ano_Fundacao);
        stmt.setString(4, Descricao);
        
        stmt.executeUpdate();
        stmt.close();
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    public void DelEditora(Connection con, Integer Id_Editora) throws SQLException{
        String sql = "delete from medico where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Editora);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

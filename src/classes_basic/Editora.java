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
        String sql = "insert into editora (id_editora, nome_editora, ano_fundacao , descricao) values (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Editora);
        stmt.setString(2, Nome_Editora);
        stmt.setInt(3, Ano_Fundacao);
        stmt.setString(4, Descricao);
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltEditora(Connection con, Integer Id_Editora, String Nome_Editora, Integer Ano_Fundacao, String Descricao) throws SQLException, ParseException{
        String sql = "update editora set nome_editora = ?, ano_fundacao  = ?, descricao  = ? where id_editora = ?";
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
        String sql = "delete from editora where id_editora = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Editora);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

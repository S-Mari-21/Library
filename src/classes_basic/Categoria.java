package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class Categoria{
    
    public void AddCategoria(Connection con, Integer Id_Categoria, String Nome_Categoria) throws SQLException, ParseException{
        String sql = "insert into categoria (id_categoria, nome_categoria) values (?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Categoria);
        stmt.setString(2, Nome_Categoria);

        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltCategoria(Connection con, Integer Id_Categoria, String Nome_Categoria) throws SQLException, ParseException{
        String sql = "update medico set nome_categoria = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Categoria);
        stmt.setString(2, Nome_Categoria);

        stmt.executeUpdate();
        stmt.close();
    }
    

    
    public void DelCategoria(Connection con, Integer Id_Categoria) throws SQLException{
        String sql = "delete from categoria where id_categoria = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Categoria);
                
        stmt.executeUpdate();
        stmt.close();
        
    }

}

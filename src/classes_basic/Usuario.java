package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author maria
 */
public class Usuario {
        public boolean VerificarLogon(Connection con , String Email, String Senha) throws SQLException{
        String sql = "select nome from usuario where email = ? and senha = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Email);
        stmt.setString(2, Senha);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            Informacoes.nomeusuario = rs.getString("nome");
            rs.close();
            stmt.close();
            return true;
        }
        else {
            rs.close();
            stmt.close();
            return false;
        }
    }
        
    public void AddUsuario(Connection con, Integer Id_Usuario, String Nome,String Senha, String Data_Nascimento, String Num_Celular, String Email, Boolean Admin) throws SQLException, ParseException{
        String sql = "INSERT INTO usuario (id_usuario, nome, senha, data_nascimento, num_celular, email, eAdmin) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Usuario);
        stmt.setString(2, Nome);
        stmt.setString(3, Senha);

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Nascimento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        stmt.setString(5, Num_Celular);
        stmt.setString(6, Email);
        
        stmt.setBoolean(7, Admin);
        
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltUsuario(Connection con, Integer Id_Usuario, String Nome,String Senha, String Data_Nascimento, String Num_Celular, String Email, Boolean Admin) throws SQLException, ParseException{
        String sql = "UPDATE usuario SET nome = ?, senha = ?, num_celular = ?,  email = ?, eAdmin = ? WHERE id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Usuario);
        stmt.setString(2, Nome);
        stmt.setString(3, Senha);

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Nascimento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        stmt.setString(5, Num_Celular);
        stmt.setString(6, Email);
        
        stmt.setBoolean(7, Admin);
        
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    public void DelUsuario(Connection con, Integer Id_Usuario) throws SQLException{
        String sql = "DELETE FROM usuario WHERE Id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,Id_Usuario);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

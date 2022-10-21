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
        public boolean VerificarLogon(Connection con , Integer Id_usuario, String Senha) throws SQLException{
        String sql = "select nome from medico where crm = ? and senha = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_usuario);
        stmt.setString(2, Senha);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
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
    public void AddUsuario(Connection con, Integer Id_Usuario, String Nome, String Data_Nascimento, String Num_Celular, String Email, String Senha) throws SQLException, ParseException{
        String sql = "insert into paciente (idpaciente, nome, sexo, datanascimento, endereco, telefone, numcelular, email) values (?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Usuario);
        stmt.setString(2, Nome);

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Nascimento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(3, datasql);
        
        stmt.setString(5, Num_Celular);
        stmt.setString(6, Email);
        stmt.setString(7, Senha);
        
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltUsuario(Connection con, Integer Id_Usuario, String Nome, String Data_Nascimento, String Num_Celular, String Email, String Senha) throws SQLException, ParseException{
        String sql = "update paciente set nome = ?, sexo = ?, datanascimento = ?, endereco = ?, telefone = ?, numcelular = ?, email = ?  where idpaciente = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
         stmt.setInt(1, Id_Usuario);
        stmt.setString(2, Nome);

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Nascimento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(3, datasql);
        
        stmt.setString(5, Num_Celular);
        stmt.setString(6, Email);
        stmt.setString(7, Senha);
        
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    public void DelUsuario(Connection con, Integer Id_Usuario) throws SQLException{
        String sql = "delete from paciente where idpaciente = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,Id_Usuario);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

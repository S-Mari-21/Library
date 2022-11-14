package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Gerenciar_Usuario {
 
    public boolean VerificarLogon(Connection con, Usuario usuario) throws SQLException{
        String sql = "select * from usuario where email = ? and senha = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getEmail());
        stmt.setString(2, usuario.getSenha());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            Informacoes.eAdmin = rs.getString("eAdmin");
            Informacoes.id_usuario = rs.getInt("id_usuario");
            Informacoes.ePremium = rs.getString("ePremium");
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
    
       public boolean VerificarLogon_RecuperarSenha(Connection con,Usuario usuario) throws SQLException{
        String sql = "select * from usuario where email = ? and num_celular = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getEmail());
        stmt.setString(2, usuario.getNum_celular());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            Informacoes.id_usuario = rs.getInt("id_usuario");
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
       
      public boolean VerificarEmail(Connection con,Usuario usuario) throws SQLException{
        String sql = "select * from usuario where email = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getEmail());
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
           
    
    
       
    public void AddUsuario(Connection con,Usuario usuario) throws SQLException, ParseException{
        String sql = "INSERT INTO usuario (id_usuario, nome, senha, data_nascimento, num_celular, email, eAdmin, ePremium) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, usuario.getId_usuario());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getSenha());

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(usuario.getData_nascimento()); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        stmt.setString(5, usuario.getNum_celular());
        stmt.setString(6, usuario.getEmail());
        
        stmt.setBoolean(7, usuario.getAdmin());
        stmt.setBoolean(8, usuario.getEpremium());
        
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltUsuario(Connection con,Usuario usuario) throws SQLException, ParseException{
        String sql = "UPDATE usuario SET nome = ?, senha = ?, num_celular = ?,  email = ?, eAdmin = ?, ePremium = ? WHERE id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, usuario.getId_usuario());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getSenha());

        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(usuario.getData_nascimento()); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        stmt.setString(5, usuario.getNum_celular());
        stmt.setString(6, usuario.getEmail());
        
        stmt.setBoolean(7, usuario.getAdmin());
        stmt.setBoolean(8, usuario.getEpremium());
        
        
        stmt.executeUpdate();
        stmt.close();
    }
       public void Recuperar_Senha(Connection con,Usuario usuario) throws SQLException, ParseException{ 
        String sql = "UPDATE usuario SET senha = ? WHERE id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(2, usuario.getId_usuario());
        stmt.setString(1, usuario.getSenha());  
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    
    public void DelUsuario(Connection con,Usuario usuario) throws SQLException{
        String sql = "Delete from usuario where id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,usuario.getId_usuario());
                
        stmt.executeUpdate();
        stmt.close();
        
    }
    
    public void NivelUsuario(Connection con, Usuario usuario) throws SQLException{
        String sql = "UPDATE usuario SET eAdmin = ? WHERE id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,usuario.getId_usuario());
        stmt.setInt(2,usuario.getId_usuario());
        
        
        stmt.executeUpdate();
        stmt.close();
        
    }
    
    public List<Usuario> listarUsuarios(Connection con) throws SQLException{
    
        String sql = "select *from usuario where id_usuario = ?";
            
        List<Usuario> lista = new ArrayList<>();
        PreparedStatement stmt = con.prepareStatement(sql);
            
        ResultSet rs = stmt.executeQuery();
            
        while(rs.next()){
            Usuario usuario = new Usuario();
                
            usuario.setId_usuario(rs.getInt("id_usuario"));
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
            usuario.setNum_celular(rs.getString("num_celular"));
            usuario.setData_nascimento(rs.getString("data_nascimento"));
            usuario.setAdmin(rs.getBoolean("eAdmin"));
            usuario.setEpremium(rs.getBoolean("ePremium"));
                
   
            lista.add(usuario);
        }
    return lista;
        
    }
}

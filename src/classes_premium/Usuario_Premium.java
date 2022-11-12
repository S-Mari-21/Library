package classes_premium;

/**
 * Classe que recebe herança da classe do Usuario basico.
 *
 * @author maria
 */
import classes_basic.Gerenciar_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class Usuario_Premium extends Gerenciar_Usuario{
    
    public void AddUsuarioPremium(Connection con, Integer Id_Usuario, String logradouro, Integer Num_Casa, String Bairro, String Cidade, String UF, String CEP, String CPF) throws SQLException, ParseException{
        String sql = "insert into usuario_premium (id_usuario, logradouro, num_casa, bairro, cidade, uf, cep, cpf) values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        
        stmt.setInt(1, Id_Usuario);
        stmt.setString(2, logradouro);
        
        stmt.setInt(3, Num_Casa);
        stmt.setString(4, Bairro);
        stmt.setString(5, Cidade);
        stmt.setString(6, UF);
        stmt.setString(7, CEP);
        stmt.setString(8, CPF);
        
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltUsuarioPremium(Connection con, Integer Id_Usuario, String logradouro, Integer Num_Casa, String Bairro, String Cidade, String UF, String CEP, String CPF) throws SQLException, ParseException{
        String sql = "update usuario_premium set logradouro = ?, num_casa = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, cpf = ?  where id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Usuario);
        stmt.setString(2, logradouro);
        
        stmt.setInt(3, Num_Casa);
        stmt.setString(4, Bairro);
        stmt.setString(5, Cidade);
        stmt.setString(6, UF);
        stmt.setString(7, CEP);
        stmt.setString(8, CPF);
        
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    public void DelUsuarioPremium(Connection con, Integer Id_Livro) throws SQLException{
        String sql = "delete from usuario_premium where id_usuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Livro);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

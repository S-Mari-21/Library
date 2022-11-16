package classes_premium;

/**
 *
 * @author maria
 */
import classes_basic.Gerenciar_Livro;
import classes_basic.Informacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class Livro_Premium extends Gerenciar_Livro{

    public void Dados(Connection con, Integer id_livro) throws SQLException{
        String sql = "select *from livro_premium where id_livro = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, id_livro);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            System.out.println("Executando set dados...");
            Informacoes.valor_venda = rs.getDouble("valor_venda");
            Informacoes.valor_alugar = rs.getDouble("valor_aluguel") ;
            
            rs.close();
            stmt.close();         
        }
        else {
            rs.close();
            stmt.close();   
        }
    }
    
public void AddLivroPremium(Connection con, Integer Id_Livro, Double Preco_Livro, Double Preco_Total, Double Desconto, Double Valor_Frete) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql

        stmt.setInt(1, Id_Livro);
        stmt.setDouble(2, Preco_Livro);
        stmt.setDouble(3, Preco_Total);
        stmt.setDouble(4, Desconto);
        stmt.setDouble(5, Valor_Frete);
        
         
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltLivroPremium(Connection con, Integer Id_Livro, Double Preco_Livro, Double Preco_Total, Double Desconto, Double Valor_Frete) throws SQLException, ParseException{
        String sql = "update medico set nome = ?, cpf = ?, email = ?, numcelular = ?, datanascimento = ?, senha = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Livro);
        stmt.setDouble(2, Preco_Livro);
        stmt.setDouble(3, Preco_Total);
        stmt.setDouble(4, Desconto);
        stmt.setDouble(5, Valor_Frete);
        
         
        stmt.executeUpdate();
        stmt.close();
    }
        
    public void DelLivroPremium(Connection con, Integer Id_Livro) throws SQLException{
        String sql = "delete from medico where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Livro);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

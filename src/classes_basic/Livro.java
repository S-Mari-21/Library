package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author maria
 */
public class Livro {
    
    public void AddLivro(Connection con, Integer Id_Livro, String Titulo, String Descricao, String Ano_Lancamento, String Nome_Autor, Byte Capa, Integer Quantidade_Total, Integer Quantidade_Emprestados, Integer EPremium) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Livro);
        stmt.setString(2, Titulo);
        stmt.setString(3, Descricao);

        
        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Ano_Lancamento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        
        stmt.setString(5, Nome_Autor);
        stmt.setByte(6, Capa);
        stmt.setInt(7, Quantidade_Total); 
        stmt.setInt(8, Quantidade_Emprestados); 
        stmt.setInt(9, EPremium); 
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltLivro(Connection con, Integer Id_Livro, String Titulo, String Descricao, String Ano_Lancamento, String Nome_Autor, Byte Capa, Integer Quantidade_Total, Integer Quantidade_Emprestados, Integer EPremium) throws SQLException, ParseException{
        String sql = "update medico set nome = ?, cpf = ?, email = ?, numcelular = ?, datanascimento = ?, senha = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        

        stmt.setInt(1, Id_Livro);
        stmt.setString(2, Titulo);
        stmt.setString(3, Descricao);

        
        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Ano_Lancamento); // Transformando a data para um campo java
        java.sql.Date datasql = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(4, datasql);
        
        
        stmt.setString(5, Nome_Autor);
        stmt.setByte(6, Capa);
        stmt.setInt(7, Quantidade_Total); 
        stmt.setInt(8, Quantidade_Emprestados); 
        stmt.setInt(9, EPremium); 
        
        stmt.executeUpdate();
        stmt.close();
    }
       
    public void DelLivro(Connection con, Integer Id_Livro) throws SQLException{
        String sql = "delete from medico where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Livro);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import classes_banco.Conexao_db;
import java.io.File;
import java.sql.Blob;
import java.sql.ResultSet;
/**
 *
 * @author maria
 */
public class Livro {
    Connection conexao;
    private Conexao_db con;

    public boolean Verificar(Connection con,  String Titulo) throws SQLException{
        String sql = "select * from livro where titulo = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Titulo);
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
  
    
    public void AddLivro(Connection con, Integer Id_Livro, String Titulo, String Descricao, String Ano_Lancamento, String Nome_Autor, Byte  Capa, Integer Quantidade_Total, Integer Quantidade_Emprestados, Integer EPremium) throws SQLException, ParseException{
        String sql = "insert into livro (id_livro, titulo, descricao, data_lancamento, nome_autor, quantidade, quantidade_emprestados, epremium) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        String sql = "update livro set titulo = ?, descricao = ?, data_lancamento = ?, nome_autor = ?, quantidade = ?, quantidade_emprestados = ?, epremium = ? where id_livro = ?";
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
        String sql = "delete from livro where id_livro = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Livro);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
    
    public Integer LivrosDisponiveis(Integer quantidade_total, Integer quantidade_emprestados){
        return quantidade_total-quantidade_emprestados;
    }
    

}

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
public class Gerenciar_Livro {
    public void Dados(Connection con,Livro livro) throws SQLException{
        String sql = "select *from livro where id_livro = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, livro.getId_livro());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            System.out.println("Executando set dados...");
            livro.setId_livro(rs.getInt("id_livro")) ;
            livro.setId_editora(rs.getInt("id_editora"));
            livro.setId_categoria(rs.getInt("id_categoria"));
            livro.setAno_lancamento(rs.getString("data_lancamento"));
            livro.setEpremium(rs.getBoolean("ePremium"));
            livro.setDescricao(rs.getString("descricao"));
            livro.setQuantidade_total(rs.getInt("quantidade"));
            
            rs.close();
            stmt.close();
            
        }
        else {
            rs.close();
            stmt.close();
            
        }
    }
    public boolean Verificar(Connection con,Livro livro) throws SQLException{
        String sql = "select id_livro from livro where titulo = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, livro.getTitulo());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            Informacoes.id_livro = rs.getInt("id_livro");
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
  
  
    public void AddLivro(Connection con,Livro livro) throws SQLException, ParseException{
        String sql = "insert into livro (id_livro, titulo, descricao, data_lancamento, nome_autor, capa, quantidade, quantidade_emprestados, epremium) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        
        stmt.setInt(1, livro.getId_livro());
        stmt.setString(2, livro.getTitulo());
        stmt.setString(3, livro.getDescricao());
        stmt.setString(4, livro.getAno_lancamento()); 
        stmt.setString(5, livro.getNome_autor());
        //stmt.setBytes(6,livro.getCapa());
        stmt.setInt(7, livro.getQuantidade_total()); 
        stmt.setInt(8, livro.getQuantidade_emprestados()); 
        stmt.setBoolean(9, livro.getEpremium()); 
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    
     public void AltLivro(Connection con,Livro livro) throws SQLException, ParseException{
        String sql = "update livro set titulo = ?, descricao = ?, data_lancamento = ?, nome_autor = ?, capa = ?, quantidade = ?, quantidade_emprestados = ?, epremium = ? where id_livro = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, livro.getId_livro());
        stmt.setString(2, livro.getTitulo());
        stmt.setString(3, livro.getDescricao());
        stmt.setString(4, livro.getAno_lancamento()); 
        stmt.setString(5, livro.getNome_autor());
        //stmt.setBytes(6,livro.getCapa());
        stmt.setInt(7, livro.getQuantidade_total()); 
        stmt.setInt(8, livro.getQuantidade_emprestados()); 
        stmt.setBoolean(9, livro.getEpremium()); 
        
        
        stmt.executeUpdate();
        stmt.close();
    }
       
    public void DelLivro(Connection con,Livro livro) throws SQLException{
        String sql = "delete from livro where id_livro = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, livro.getId_livro());
                
        stmt.executeUpdate();
        stmt.close();
        
    }
    
        public List<Livro> listarLivros(Connection con) throws SQLException{
    
            String sql = "select *from livro where id_livro = ?";
            
            List<Livro> lista = new ArrayList<>();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Livro livro = new Livro();
                
                livro.setTitulo(rs.getString("livro"));
                livro.setNome_autor(rs.getString("nome_autor"));
                livro.setDescricao(rs.getString("descricao"));
                //livro.setCapa(rs.getBytes("capa"));
   
                lista.add(livro);
            }
            
        return lista;
        
        
    }
    
    public Integer LivrosDisponiveis(Livro livro){
        return livro.getQuantidade_total()-livro.getQuantidade_emprestados();
    }
    
}

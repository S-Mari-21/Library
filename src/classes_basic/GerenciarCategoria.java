package classes_basic;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
/**
 *
 * @author maria
 */
public class GerenciarCategoria {
    public void Dados(Connection con,Categoria categoria) throws SQLException{
        String sql = "select *from categoria where id_categoria = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, categoria.getId_categoria());
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            System.out.println("Executando set dados...");
            categoria.setNome_categoria(rs.getString("nome_categoria"));
            rs.close();
            stmt.close();
            
        }
        else {
            rs.close();
            stmt.close();
            
        }
    }
    @SuppressWarnings("empty-statement")
    public boolean VerificarCategoria(Connection con,Categoria categoria) throws SQLException, ParseException{
        String sql = "select *from categoria where id_categoria = ?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, categoria.getId_categoria());
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()){
            Informacoes.id_categoria  = rs.getInt("id_categoria");;
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
    
     public void AddCategoria(Connection con, Categoria categoria) throws SQLException, ParseException{
        String sql = "insert into categoria (id_categoria, nome_categoria) values (?, ?)";
        
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        
        stmt.setInt(1, categoria.getId_categoria());
        stmt.setString(2, categoria.getNome_categoria());

        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltCategoria(Connection con,Categoria categoria) throws SQLException, ParseException{
        String sql = "update categoria set nome_categoria = ? where id_categoria = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(2,categoria.getId_categoria());
        stmt.setString(1, categoria.getNome_categoria());

        stmt.executeUpdate();
        stmt.close();
    }
    

    
    public void DelCategoria(Connection con,Categoria categoria) throws SQLException{
        String sql = "delete from categoria where id_categoria = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, categoria.getId_categoria());
                
        stmt.executeUpdate();
        stmt.close();
        
    }
    
    public ResultSet listarCategorias(Connection con) throws SQLException{
        String categorias = "select * from categoria order by nome_categoria";
        
        PreparedStatement stmt = con.prepareStatement(categorias);
        return stmt.executeQuery();
        
    }   
}

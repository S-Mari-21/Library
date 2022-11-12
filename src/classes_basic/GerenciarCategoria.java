package classes_basic;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import classes_banco.Conexao_db;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author maria
 */
public class GerenciarCategoria {
    Conexao_db conexao;
    private Connection con;
    
    
     public void AddCategoria(Categoria categoria) throws SQLException, ParseException{
        String sql = "insert into categoria (id_categoria, nome_categoria) values (?, ?)";
        
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        
        stmt.setInt(1, categoria.getId_categoria());
        stmt.setString(2, categoria.getNome_categoria());

        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltCategoria(Categoria categoria) throws SQLException, ParseException{
        String sql = "update medico set nome_categoria = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1,  categoria.getId_categoria());
        stmt.setString(2, categoria.getNome_categoria());

        stmt.executeUpdate();
        stmt.close();
    }
    

    
    public void DelCategoria(Categoria categoria) throws SQLException{
        String sql = "delete from categoria where id_categoria = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, categoria.getId_categoria());
                
        stmt.executeUpdate();
        stmt.close();
        
    }
    
    public List<Categoria> listarCategoria() throws SQLException{
    
            String sql = "select *from categoria where id_categoria = ?";
            
            List<Categoria> lista = new ArrayList<>();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNome_categoria(rs.getString("nome_categoria"));
   
                lista.add(categoria);
            }
     return lista;
        
    }
    
    
    
}

package classes_basic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.sql.ResultSet;

public class GerenciarEditora {
    public void Dados(Connection con, Editora editora) throws SQLException{
        String sql = "select * from editora where id_editora = ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, editora.getId_editora());
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            System.out.println("Executando set dados...");
            editora.setNome_editora(rs.getString("nome_editora"));
            editora.setDescricao(rs.getString("descricao"));
            rs.close();
            stmt.close();
            
        }
        else {
            rs.close();
            stmt.close();
            
        }  
    }    
    public boolean VerificarEditora(Connection con,Editora editora) throws SQLException, ParseException{
        String sql = "select *from editora where nome_editora = ?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, editora.getNome_editora());
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()){
            Informacoes.id_editora  = rs.getInt("id_editora");;
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
    public void AddEditora(Connection con,Editora editora) throws SQLException, ParseException{
        String sql = "insert into editora (id_editora, nome_editora, ano_fundacao , descricao) values (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, editora.getId_editora());
        stmt.setString(2, editora.getNome_editora());
        stmt.setString(3, editora.getAno_fundacao());
        stmt.setString(4, editora.getDescricao());
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltEditora(Connection con,Editora editora) throws SQLException, ParseException{
        String sql = "update editora set nome_editora = ?, ano_fundacao  = ?, descricao  = ? where id_editora = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        
        stmt.setString(1, editora.getNome_editora());
        stmt.setString(2, editora.getAno_fundacao());
        stmt.setString(3, editora.getDescricao());
        stmt.setInt(4, editora.getId_editora());
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    
    public void DelEditora(Connection con,Editora editora) throws SQLException{
        String sql = "delete from editora where id_editora = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, editora.getId_editora());
                
        stmt.executeUpdate();
        stmt.close();
        
    }
 
    public ResultSet listarEditoras(Connection con) throws SQLException{
        String categorias = "select * from editora order by nome_editora";
        
       
        PreparedStatement stmt = con.prepareStatement(categorias);
        return stmt.executeQuery();    
    }  
}

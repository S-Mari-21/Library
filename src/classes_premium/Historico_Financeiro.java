/*Histórico contendo todas as informações dos livros vendidos e alugados*/

package classes_premium;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import classes_basic.Historico;
/**
 *
 * @author maria
 */
public class Historico_Financeiro extends Historico {
    
        public void AddHistoricoFinanceiro(Connection con, Integer Id_Pagamento) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        
        stmt.setInt(1, Id_Pagamento);      
        
        stmt.executeUpdate();
        stmt.close();
           
       }
}

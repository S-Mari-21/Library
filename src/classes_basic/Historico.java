package classes_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author maria
 */

public class Historico {
        
    public void AddEmprestimo(Connection con, Integer Id_Emprestimo, Integer Id_Livro, Integer Id_Usuario) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Emprestimo);
        stmt.setInt(2, Id_Livro);
        stmt.setInt(2, Id_Usuario);
        
        stmt.executeUpdate();
        stmt.close();
           
       }

}

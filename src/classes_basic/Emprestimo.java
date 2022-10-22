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
public class Emprestimo {
    
    public void AddEmprestimo(Connection con, Integer Id_Emprestimo, String Data_Emprestimo, String Data_Devolucao) throws SQLException, ParseException{
        String sql = "insert into medico (crm, nome, cpf, email, numcelular, datanascimento, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql); //Este Statement é quem permite executar esta isntrução no sql
        stmt.setInt(1, Id_Emprestimo);
        
        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Emprestimo); // Transformando a data para um campo java
        java.sql.Date dataEmprestimo = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(2, dataEmprestimo);
        
        //Conversão do campo data sql-java
        data = sdf.parse(Data_Devolucao); // Transformando a data para um campo java
        java.sql.Date dataDevolucao = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(3, dataDevolucao);
        
        stmt.executeUpdate();
        stmt.close();
           
       }
    
    public void AltEmprestimo(Connection con, Integer Id_Emprestimo, String Data_Emprestimo, String Data_Devolucao) throws SQLException, ParseException{
        String sql = "update medico set nome = ?, cpf = ?, email = ?, numcelular = ?, datanascimento = ?, senha = ? where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, Id_Emprestimo);
        
        //Conversão do campo data sql-java
        SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy"); //Estabelecendo o formato da data String
        java.util.Date data = sdf.parse(Data_Emprestimo); // Transformando a data para um campo java
        java.sql.Date dataEmprestimo = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(2, dataEmprestimo);
        
        //Conversão do campo data sql-java
        data = sdf.parse(Data_Devolucao); // Transformando a data para um campo java
        java.sql.Date dataDevolucao = new java.sql.Date(data.getTime()); // Transformando a data para sql
        stmt.setDate(3, dataDevolucao);
        
        stmt.executeUpdate();
        stmt.close();
    }
        
    public void DelEmprestimo(Connection con, Integer Id_Emprestimo) throws SQLException{
        String sql = "delete from medico where crm = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Id_Emprestimo);
                
        stmt.executeUpdate();
        stmt.close();
        
    }
}

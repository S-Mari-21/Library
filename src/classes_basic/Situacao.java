package classes_basic;
/**
 *
 * @author maria
 */
public class Situacao {

    private String sit;
    
    public void Situacao(String sit){
        this.sit = sit;
    }
      
    public void Informar_Situacao(Character situacao){
           
        switch(situacao){
            case 'A':
                   sit = "Indisponivel";
                break;
             
            case 'B':
                   sit = "Disponivel";
                break;
                
            case 'C':
                   sit = "Em atraso";
                break;
                
            case 'D':
                   sit = "Data de Devolução: ";
                break;
                
            case 'E':
                   sit = "Multa: ";
                break; 
                
             case 'F':
                   sit = "Devolvido!";
                break;   
                
            default:
                   sit = "Erro";
        }
    }
    
    
    public String getSituacao(){
        return sit;
    }  
     
    //Disponibilidade do emprestimo com relação a quantidade disponiveis de livros:
    public void Situacao_Emprestimo(Integer quantidade){
        if (quantidade>=1){
            Informar_Situacao('B');
        }
        else {
            Informar_Situacao('A');
        }
    }
    
    //Situação do livro que está emprestado, isto é, se foi devolvido ou não:
    public void Status_Emprestimo(Boolean devolucao){
        if (devolucao == true){
            Informar_Situacao('F');
        } else {
            Informar_Situacao('C');
        }
    }
}

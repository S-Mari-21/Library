package classes_basic;

/**
 *
 * @author maria
 */
public class Situacao {

    String sit;
    
    
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
                
            default:
                   sit = "Erro";
        }
    }
    
    public String getSituacao(){
        return sit;
    }
    
    public String setSituacao(){
        return sit;
    }
    
    
   
}

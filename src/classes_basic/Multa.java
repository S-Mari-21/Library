package classes_basic;

public class Multa{
    public Double multa;
    private String data_Emprestimo;
    private String data_Devolucao;
    
 
    public Multa(String data_Devolucao, String data_Emprestimo){
        this.data_Devolucao = data_Devolucao;
        this.data_Emprestimo = data_Emprestimo;      
    }
              
    
    public void Data_Devolucao(String data_Devolucao)	{
    /*Data de devolução é igual a data de emprestimo + 10 dias*/
    }
    
    
    
    public Integer Dias_Atrasados(Integer dias, String data_Devolucao, String data_Atual)	{ 
        /*Dias é igual a data de devolucao menos data atual*/
        return dias;
    }
    
    
   
    public Double Multa(Integer dias){
        multa = dias*1.00;
        return multa;
    }
    
    
    Situacao m = new Situacao();
    public void Situacao_Multa(Double multa)	{
         
        if (multa>0){                 
            m.Informar_Situacao('E');
            System.out.print(m.getSituacao()+getMulta());
            
        }else {
            m.Informar_Situacao('D');
            System.out.println(m.getSituacao());
        }
        
    }
      
    public String getDate(){
        return data_Devolucao;
    }
    
    public Double getMulta(){
        return  multa;
    }

}

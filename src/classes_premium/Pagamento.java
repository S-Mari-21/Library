/*Classe responsável por receber o tipo de pagamento e realizar os cálculos
sobre valor final da venda ou aluguel do livro*/
package classes_premium;
/**
 *
 * @author maria
 */
public class Pagamento {
    //pagamento
    private Character opcao;
    private Livro_Premium preco;
    private Livro_Premium prazo;
    
    
    public void Opcao(Character opcao, Livro_Premium preco, Livro_Premium prazo){
        this.opcao = opcao;
        this.preco = preco;
        this.prazo = prazo;
        
    }
          
    /**
     *
     * @param opcao
     * @param preco
     * @param prazo
     */
    public void Pagamento(Character opcao, Double preco, Integer prazo){
        if (opcao == 'A'){
            System.out.println("Valor a pagar: "+Alugar(preco, prazo));
                
        }else if (opcao == 'C'){
            System.out.println("Valor a pagar: "+Comprar(preco));
            
        }else {
            System.out.print("Opção incorreta, escolha outra opção!");
        }
    }
    
    
//Precisa ter livros disponiveis
    public Double Alugar(Double preco, Integer prazo){
        Double valor = preco + prazo; 
        return valor;
    }   
    
    public Double Comprar(Double preco){
        Double valor = preco+20; //Valor do frete = 20
        return valor;
    }
       
}

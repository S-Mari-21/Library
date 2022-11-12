package classes_basic;
/**
 *
 * @author maria
 */
public class Livro {
    private Integer id_livro;
    private String titulo;
    private String descricao;
    private String ano_lancamento;
    private String nome_autor;
    private Byte[] capa;
    private Integer quantidade_total;
    private Integer quantidade_emprestados;
    private Boolean epremium;
    
    public Integer getId_livro() {
        return id_livro;
    }
    public void setId_livro(Integer id_livro) {
        this.id_livro = id_livro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getAno_lancamento() {
        return ano_lancamento;
    }
    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }
    public String getNome_autor() {
        return nome_autor;
    }
    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }
    public Byte[] getCapa() {
        return capa;
    }
    public void setCapa(Byte[] capa) {
        this.capa = capa;
    }
    public Integer getQuantidade_total() {
        return quantidade_total;
    }
    public void setQuantidade_total(Integer quantidade_total) {
        this.quantidade_total = quantidade_total;
    }
    public Integer getQuantidade_emprestados() {
        return quantidade_emprestados;
    }
    public void setQuantidade_emprestados(Integer quantidade_emprestados) {
        this.quantidade_emprestados = quantidade_emprestados;
    }
    public Boolean getEpremium() {
        return epremium;
    }
    public void setEpremium(Boolean epremium) {
        this.epremium = epremium;
    }
    

}

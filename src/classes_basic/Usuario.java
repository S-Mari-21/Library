package classes_basic;

/**
 *
 * @author maria
 */
public class Usuario {
       private Integer id_usuario; 
       private String nome;
       private String senha;
       private String data_nascimento;
       private String num_celular;
       private String email;
       private Boolean admin;
       private Boolean epremium;

       
       public Integer getId_usuario() {
              return id_usuario;
       }
       public void setId_usuario(Integer id_usuario) {
              this.id_usuario = id_usuario;
       }
       public String getNome() {
              return nome;
       }
       public void setNome(String nome) {
              this.nome = nome;
       }
       public String getSenha() {
              return senha;
       }
       public void setSenha(String senha) {
              this.senha = senha;
       }
       public String getData_nascimento() {
              return data_nascimento;
       }
       public void setData_nascimento(String data_nascimento) {
              this.data_nascimento = data_nascimento;
       }
       public String getNum_celular() {
              return num_celular;
       }
       public void setNum_celular(String num_celular) {
              this.num_celular = num_celular;
       }
       public String getEmail() {
              return email;
       }
       public void setEmail(String email) {
              this.email = email;
       }
       public Boolean getAdmin() {
              return admin;
       }
       public void setAdmin(Boolean admin) {
              this.admin = admin;
       }
       public Boolean getEpremium() {
              return epremium;
       }
       public void setEpremium(Boolean epremium) {
              this.epremium = epremium;
       }
       

}

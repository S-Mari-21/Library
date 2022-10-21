package classes_seguranca;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author maria
 */
public class Criptografar {

    public String CriptografiaMD5(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException  {
     
            String SenhaCriptografada;
            //Criando uma instância de um algoritmo de criptografia Message Digest utilizando MD5
            MessageDigest algoritmo = MessageDigest.getInstance("MD5");  //objeto pronto para criptografar utilizando MD5
            
           //Atualizando a senha em uma mensagem do tipo MessageDigest
           algoritmo.update(senha.getBytes(), 0, senha.length());

           //Convertendo em uma  mensagem em base Hex - base 16 (String)
           SenhaCriptografada = new BigInteger(1, algoritmo.digest()).toString(16);
           
           //algoritmo.digest()).toString();  TEM RETORNO O TIPO BYTE[]      
           return SenhaCriptografada;
          
        }  
    }
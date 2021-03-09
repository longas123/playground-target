package exceptions.exemplos;

//extends - herança
//Exception - classe que está sendo herdada
public class UsuarioNaoAutenticadoException extends Exception {

    public UsuarioNaoAutenticadoException(String mensagem){
        super(mensagem);// Passa a mensagem pelo construtor da classe pai (Exception)
    }
}
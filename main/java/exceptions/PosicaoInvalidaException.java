package exceptions;


public class PosicaoInvalidaException extends Exception{ //herança

    public PosicaoInvalidaException(String mensagem){
        super(mensagem);//Passa a mensagem pelo contrutor da classe pai
    }
}

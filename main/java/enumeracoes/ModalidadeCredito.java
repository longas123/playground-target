package enumeracoes;

public class ModalidadeCredito {


    public static TipoCartao obtemTipoDeCartao(double rendaMensal) {
        if (rendaMensal < 1000) {
            return TipoCartao.STANDARD;
        }else if(rendaMensal < 3000){
            return TipoCartao.GOLD;
        }else if(rendaMensal < 10_000){
            return TipoCartao.PREMIUM;
        }else{
            return TipoCartao.BLACK;
        }
    }



}



//        Crie um novo pacote enumeracoes. Neste crie uma classe ExercicioEnumeracoes com o método main.
//        No mesmo pacote crie a classe ModalidadeCredito e nela crie um método quedevolve o tipo de cartão de uma financeira de acordo com a
//        rendaMensal:< 1000: STANDARD< 3000: GOLD< 10000: PREMIUM>= 10000:
//        BLACKNa classe ExercicioEnumeracoes, instancie a nova classe e faça algumassimulações para validar o comportamento.
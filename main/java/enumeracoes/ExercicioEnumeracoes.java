package enumeracoes;

import java.util.Scanner;

public class ExercicioEnumeracoes {

    public static void main(String[] args) {

        System.out.println(ModalidadeCredito.obtemTipoDeCartao(999));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(2_999));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(9_999));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(10_001));

//        System.out.println("Digite sua poupança para saber o tipo de Cartão");
//        long valor = new Scanner(System.in).nextLong();
//
//
//
//        if(valor < 1000){
//            ModalidadeCredito standard = ModalidadeCredito.STANDARD;
//            System.out.println(standard);
//        }
//        if(valor < 3000 && valor > 1000){
//            ModalidadeCredito gold = ModalidadeCredito.GOLD;
//            System.out.println(gold);
//        }
//        if(valor < 10000 && valor > 3000){
//            ModalidadeCredito premium = ModalidadeCredito.PREMIUM;
//            System.out.println(premium);
//        }
//        if(valor > 10000){
//            ModalidadeCredito black = ModalidadeCredito.BLACK;
//            System.out.println(black);
//        }



    }
}



//        Crie um novo pacote enumeracoes. Neste crie uma classe ExercicioEnumeracoes com o método main.
//        No mesmo pacote crie a classe ModalidadeCredito e nela crie um método quedevolve o tipo de cartão de uma financeira de acordo com a
//        rendaMensal:< 1000: STANDARD< 3000: GOLD< 10000: PREMIUM>= 10000:
//        BLACKNa classe ExercicioEnumeracoes, instancie a nova classe e faça algumassimulações para validar o comportamento.
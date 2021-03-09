//package exceptions;
//
//import java.util.*;
//
//public class ExercicioExcecoes {
//
//    public static void main(String[] args) throws PosicaoInvalidaException {
//            metodoValidaExceptions();
//
//    }
//        public static void metodoValidaExceptions() throws PosicaoInvalidaException {
//            Boolean looping = false;
//            int valor = 0;
//            List<String> cidades;
//            cidades = Arrays.asList("Porto Alegre", "Curitiba", "São Paulo",
//                    "Rio de Janeiro",
//                    "Cuiabá",
//                    "São Luís");
//            System.out.println("Escolha a posição da cidade");
//            Scanner sc = new Scanner(System.in);
//          do {
//              try {
//                  valor = sc.nextInt();
//                  System.out.println(cidades.get(valor));
//                  looping = true;
//              } catch (Exception e) {
//                  System.err.println("Escolha uma posicao correta");
//                  sc.nextLine();
//              }
//          }while (looping == false);
//    }
//}
package exceptions;


        import exceptions.PosicaoInvalidaException;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;

public class ExercicioExcecoes {
    //Constante
    private static final List<String> CIDADES = Arrays.asList(
            "Porto Alegre", "Curitiba",
            "São Paulo", "Rio de Janeiro",
            "Cuiabá", "São Luís.", "Canoas");

    public static void main(String[] args) throws PosicaoInvalidaException {

        System.out.printf("Informe a posição de uma das cidades [1-%d]: \n", CIDADES.size());
        int posicao = pedePosicaoAteInformadoCorreto();
        String nomeCidade = CIDADES.get(posicao-1);
        System.out.println("Você escolheu: " + nomeCidade);
    }

    private static Integer pedePosicaoAteInformadoCorreto() {
        while (true) {
            try {
                return pedePosicao();
            } catch (PosicaoInvalidaException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int pedePosicao() throws PosicaoInvalidaException {
        int posicao = new Scanner(System.in).nextInt();

        if(posicao <= 0 || posicao > CIDADES.size()){
            String message = String.format("Opção inválida, informe uma opção de 1 a %d", CIDADES.size());
            throw new PosicaoInvalidaException(message);
        }
        return posicao;
    }
}
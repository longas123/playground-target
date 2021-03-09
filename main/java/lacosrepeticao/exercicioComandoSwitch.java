package lacosrepeticao;

import java.util.Scanner;

public class exercicioComandoSwitch {

    public static void main(String[] args) {

        System.out.println("Classificação do Produto");
        int nota = new Scanner(System.in).nextInt();

        switch (nota){
            case 0:
            case 1:
                System.out.println("Péssimo");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Digite uma nota válida");
        }
    }
}

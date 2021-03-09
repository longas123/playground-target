package lacosrepeticao;

import java.util.Scanner;

public class ExercicioComando {


    public static void main(String[] args) {

        System.out.println("Digite a nota:");
        int nota = new Scanner(System.in).nextInt();
        boolean aprovado = nota >=7;

        if(aprovado){
            System.out.println("Passou");
        }else{
            System.out.println("Rodou");
        }


    }
}

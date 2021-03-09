package lacosrepeticao;

import java.util.Scanner;

public class ExemploComandos {

    public static void main(String[] args) {

//        System.out.println("Digite um número");
//        int numero = new Scanner(System.in).nextInt();
//
//        boolean ehPar = numero %2 == 0;
//
//        if(ehPar){
//            System.out.println("Par");
//        }else{
//            System.out.println("Impar");
//        }

//        byte ddd = 55;
//
//        switch (ddd){
//            case 51:
//                System.out.println("Porto Alegre");
//                break;
//            case 53:
//                System.out.println("Pelotas e região");
//                break;
//            case 54:
//                System.out.println("Caxias do Sul");
//                break;
//            case 55:
//                System.out.println("Santa Maria");
//                break;
//            default:
//                System.out.println("Nenhuma das regiões");
//        }

        int contador = 0;

        while(contador <=10){
            contador++;
            System.out.println(contador);
        }

        //Laços infinitos -> for(;;){ if(){} } igual while (true){}

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }


        int menu = 0;

        do {
            System.out.println("Informe o menu: 1- Adm, 2- Cadastro");
            menu = new Scanner(System.in).nextInt();
        }while (menu != 1 && menu !=2);
    }


}

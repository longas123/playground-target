package strings;

import java.util.Scanner;

public class ExerciciosStrings {

    public static void main(String[] args) {

        //split();
        //praticaSplit();
        //substring();
        // toLowerUpper();
        indexOf();
    }
        public static void  split(){
            String csv = "Mateus,29anos";
            String[] partesCsv = csv.split(",");


            for (String parte : partesCsv) {
                System.out.println("Parte: " + parte);
            }
    }

    public static void praticaSplit(){

        String texto = new Scanner(System.in).nextLine();

        String[] quebra = texto.split(",");

        for (String parte : quebra){
            System.out.println("Quebras: "+parte);
        }
    }

    public static void substring() {

        String texto = new  Scanner(System.in).nextLine();

        if(texto.length() < 13){
            System.out.println("Texto deve possuir mais que 13 letras");
        }else{
            String parteTexto = texto.substring(0, 13);
            System.out.println("13 primeiras letras: "+parteTexto);
        }

    }

    public static void toLowerUpper(){

//        String texto = new  Scanner(System.in).nextLine();
//
//        String[] primeiraPalavra = texto.split(" ");
//        String[] primeiraPalavra = texto.split(" ");
//        String upper = primeiraPalavra[0].toUpperCase();
//        String lower = texto.toLowerCase();
//        System.out.println("Maiúsculo: " + upper);
//        System.out.println("Minúsculo: " + lower);
//        boolean  ehAPrimeira = true;
//
//        for(String parte : primeiraPalavra) {
//            if (ehAPrimeira) {
//                System.out.println(parte.toUpperCase() + " ");
//                ehAPrimeira = false;
//            }
//
//            System.out.println(parte.toLowerCase() + " ");
//        }
        String texto = new Scanner(System.in).nextLine();
        String[] array = texto.split(" ");
        System.out.print(array[0].toUpperCase());
        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[i].toLowerCase());
        }
    }

    public static void indexOf() {

        String texto = new Scanner(System.in).nextLine();

        int index = texto.indexOf(" ");

        String primeiraPalavra = texto.substring(0, index);
        String resto = texto.substring(index);

        System.out.print(primeiraPalavra.toUpperCase() + " " + resto.toLowerCase());

    }
}

package strings;

import java.util.Scanner;

public class PraticaString {

    public static void main(String[] args) {

        exercicioBuilder();

    }

//        String email = new Scanner(System.in).nextLine();

//        if(email.isBlank()){
//            System.out.println("É necessário informar seu email");
//        }else if(email.equals("seuemail@mail.com")){
//            System.out.println("Bem vindo: " + email.trim());
//        }

//        String ditado = "Mais perdido que cego em tiroteio";
//        ditado = ditado.replace("cego", "cusco").replace("tiroteio", "procissão");
//
//        System.out.println(ditado);


//        public static void imprimeInformacaoComStringBuilder(){
//            //Dentro de um método use StringBuilder
//            StringBuilder builder = new StringBuilder();
//            builder.append("Itens: ");
//            for(int i = 0; i< 10;i++){
//                builder
//                        .append(i)
//                        .append("-");
//            }
//            System.out.println(builder.toString());
//        }

    public static void exercicioBuilder() {


        boolean sair = false;
        do{
            StringBuilder builder = new StringBuilder();
            builder.append("O texto vai rolar até digitar sair");
            System.out.println(builder.toString());
            String sc = new Scanner(System.in).nextLine();
            if(sc.equals("sair")){
                 sair = true;
            }
        }while(sair == false);


    }





}

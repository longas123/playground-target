package wrappers;

public class ExemplosWrappers {


    public static void main(String[] args) {

     //AutoboxingUnboxing();
     converterEmMinuscula();


        //Exercicios


    }

    public static void AutoboxingUnboxing() {

//        Autoboxing/Unboxing:
//        Converta o seguinte array de números nas suas respectivas letras do ASCII e transforme em um Array de Strings. Após, imprima o texto resultante.
//
        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};
        String[] arrayString = new String[100];


//        for(int i = 0; i < numeros.length; i++){
//            int guarda = numeros[i];
//            arrayString[i] = Character.toString((char)guarda);// new Character((char)guarda).toString();
//        }
//
//        for(int i = 0; i < numeros.length; i++){
//            System.out.print(arrayString[i]);
//        }

        for (int numero : numeros) {
            System.out.print(Character.toString((char) numero));
        }
     }


    public static void converterEmMinuscula(){

        String letraC = converteEmMinuscula('A');
        System.out.println(letraC);

        String letraD = converteEmMinuscula(Character.valueOf('B'));
        System.out.println(letraD);
    }

    public static String converteEmMinuscula(Character letra){
        char character = letra;
        int a = (int) character;
        a = a + 32;
        return Character.toString((char)a);//???? Não vale: String.toLowerCase()
        //outra maneiras de faze
        //int codePoint = letra + 32;
        //return Character.toString(codePoint);
    }

}


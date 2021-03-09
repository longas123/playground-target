package arrays;

public class ExemploArrays {

    public static void main(String[] args) {


        int[] anos = new int[1]; // declalaração com inicialização
        anos[0] = 2020; //posição array recebendo um valor
        anos[1] = 2021;

        char[] tiposDeConta = new char[]{'c' , 'd' };
        //FOREACH!
        //Tipo nome : array
        for(char tipoConta : tiposDeConta){
            System.out.println(tipoConta);
        }
    }
}

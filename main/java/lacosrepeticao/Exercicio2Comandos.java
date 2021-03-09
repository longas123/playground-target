package lacosrepeticao;

public class Exercicio2Comandos {

    public static void main(String[] args) {
      // somaAte1000();
      // imprimiAte100();
      // fatorial();
      // arrays();
        codigoDeBarrasValidator();
    }

    public static void somarAte1000() {

        System.out.println();

        int soma = 0;

        for(int n = 1; n <= 1000; n++){
            soma += n;
            System.out.println(soma);
        }

    }

    public static void imprimiAte100() {

        for(int n = 0; n <= 1000;){
            n = n + 3;
            System.out.println(n);
        }
    }

    public static void fatorial() {

        int fatorial = 1;

        for(int i = 1; i <= 10; i++){
//            if(i <= 1){
                fatorial = i * fatorial;
           // }
            System.out.println(i + "!: " + fatorial);
        }
    }

    public static void  arrays() {
          int[] values = new int[]{88, 7, 0, -1, 45, 3, 92, -9, 300000001,12, 23567};
          int num = 0;
          int menorValor = 0;

          for(int i=0; i < values.length; i++){

              System.out.println("valor atual:" + values[i]);
              if(values[i] < menorValor){
                  menorValor = values[i];
              }
          }
          System.out.println("Menor Valor encontrado: " + menorValor);
    }

    public  static void  codigoDeBarrasValidator(){

          int[] code = new int[]{9, 8, 8, 7, 9, 7, 9, 9 ,
                  9, 8, 8, 7, 6, 8, 5, 8, 7, 7, 8, 6, 7, 0};

         int soma = 0;

        if(code.length != 22){
            System.err.println("* Tamanho deve ser igual a 22!");
            return;
        }

          for (int count : code){
             soma += count;
             System.out.println(soma);
          }

        if(soma > 99){
            int penultimoDigito = soma/10;
            int ultimoDigito = soma%10;
            code[20] = penultimoDigito%10;
            code[21] = ultimoDigito;
            System.out.println("penultimo dígito: " + penultimoDigito%10);
            System.out.println("Ultimo dígito: " + ultimoDigito);
        }

        System.out.println();
        for(int i : code){
            System.out.print(i + " ");
        }
    }
}

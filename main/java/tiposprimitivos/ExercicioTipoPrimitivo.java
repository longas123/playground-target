package tiposprimitivos;

public class ExercicioTipoPrimitivo {

    public static void main(String[] args) {

        byte idade = 25;
        System.out.printf("Idade: %d\n", idade);

        short anoAtual = 2021;
        System.out.printf("Ano atual: %d\n", anoAtual);

        boolean estaChovendo = false;
        System.out.printf("Está chovendo? %b\n", estaChovendo);

        double pi = 3.141592653589793;
        System.out.printf("PI: %.15f\n", pi);

        char primeiraLetraNome = 'M';
        System.out.printf("Primeira letra nome: %s \n", primeiraLetraNome);

        float valorDolar = 5.35F;
        System.out.printf("Valor Dolar: %.2f\n", valorDolar);

        int populacaoBrasil = 209_000_000;//pode usar underline para separar.
        System.out.printf("Populacao Brasil: %d\n", populacaoBrasil);

        long populacaoMundial = 7_700_000_000L; //L para deixar claro que é um long.
        System.out.printf("Populaçao Mundial: %d", populacaoMundial);


        int totalVendas = 1023;
        boolean boletoPago = true;
        char pagamentoCredito = 'C';
        char pagamentoDebito = 'D';
        byte[] documento;
        long cnpj = 124874546123L;
        float gardenal = 80.20f;
        long codigoDeBarras = 12345678915L;
    }

}

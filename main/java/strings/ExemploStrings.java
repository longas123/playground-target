package strings;

public class ExemploStrings {

    public static void main(String[] args) {
        //exercicioString();
        //exercicioSubstring();
        //exercicioLowerUpper();

        //Poderia chamar direto o método após a ""
        //System.out.println("Onde há fumaça há fogo".toUpperCase());

        //compareTo/compareToIgnoreCase
        // == VS compareTo VS compareToIgnoreCase
        // 0 = igual, <1 = anterior, >1 se posterior
/*
        System.out.println("Dog".compareTo("DOG"));
        System.out.println("Dog".compareToIgnoreCase("DOG"));

        System.out.println("Dog".compareTo("DOG") == 0);
        System.out.println("Dog".compareToIgnoreCase("DOG") == 0);

        System.out.println("Dog".equals("DOG"));
        System.out.println("Dog".equalsIgnoreCase("DOG"));
*/

        //TRUE - mesmo lugar no string poll - logo mesma referencia (de memória)
/*
        String dog1 = "Dog";
        String dog2 = "Dog";
        System.out.println(dog1 == dog2);

        //new String cria nova String no String pool
        String dog3 = new String("Dog");
        System.out.println(dog1 == dog3);

        String dog4 = String.valueOf("Dog");
        System.out.println(dog1 == dog4);
*/

        //Tipos primitivos (os 8 que existem): pode comparar com ==, ele compara o conteúdo
        //Para comparar outros tipos "por referência", use equals!
        //Strings comparadas com ==, compara endereço de memória! não use exceto se souber o que está fazendo!
        //Para comparar conteúdo de Strings, use equals OU compareTo.

        //chars - Trabalha com Characteres - RARO usar
        //System.out.println("Dog".contentEquals("DOG"));
        //"D".compareTo(String.valueOf('C'));

        //trim - só limpa no começo e final
//        String senha = "      se     nh     a    ";
//        System.out.println(senha.trim());
//
//        //isEmpty
//        // "" vs "   "
//        System.out.println("".isEmpty());//true, pois é vazia mesmo
//        System.out.println("     ".isEmpty());//false, pois contém caracteres
//        System.out.println("     ".isBlank());//true, pois só contém espaços
//
//        //indexOf
//        // e-mail válido? seuemail@email.com
//        System.out.println("Informe seu e-mail: ");
//        String email = new Scanner(System.in).nextLine();
//        String emailSemEspacos = email.trim();
//
//        if(emailSemEspacos.isBlank()){
//            System.out.println("É necessário informar seu e-mail!");
//        }
//
//        if(emailSemEspacos.equalsIgnoreCase("seuemail@email.com")){
//            System.out.printf("Bem vindo %s", emailSemEspacos);
//        }

        //replaceAll
        // Cão que ladra *não* morde
//        String ditado = "Cão que ladra não morde";
//        String DOIS_ESPACOS = "  ";//TODO mover para constantes!!!!
//
//        //Estou mudando a referência de memória para a nova String criada
//        ditado = ditado.replaceAll("não", "").replaceAll(DOIS_ESPACOS, " ");
//
//        System.out.println(ditado);

        //startsWith/endsWith
        // seusite.com ?.com
//        boolean terminaEmPontoCom = "seusite.com".endsWith(".com");
//        System.out.println(terminaEmPontoCom);

        //format
        // Total: 125 tomates
//        int quantidade = 125;
//        String fruta = "tomate";
//
//        String informacao = String.format("Total: %d %s", quantidade, fruta);
//        System.out.println(informacao);
//
//        String informacao2 = "Total: "+quantidade+" "+fruta;
//        System.out.println(informacao2);

        //valueOf/charAt/getBytes
        // 890, 157L, primeiro char, documento em bytes
        //imprimeInformacao(String.valueOf(quantidade));//Forma correta
        //imprimeInformacao(quantidade+"");//Feios

        //charAt
//        char primeiraLetra = "Cão".charAt(0);
//        System.out.println(primeiraLetra);
//
//        //getBytes()
//        byte[] bytesDoCao = "Cão".getBytes();
//        String aVoltaDaString = new String(bytesDoCao);


        imprimeInformacaoComStringBuilder();
    }

    public static void imprimeInformacao(String descricao){
        System.out.println(String.format("Total: %s itens", descricao));
    }

    public static void imprimeInformacaoComStringBuilder(){
        //Dentro de um método use StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("Itens: ");
        for(int i = 0; i< 10;i++){
            builder
                    .append(i)
                    .append("-");
        }
        System.out.println(builder.toString());
    }




    private static void exercicioLowerUpper() {
        //toLowerCase/toUpperCase
        String ditado = "Onde há fumaça há fogo";

        System.out.println(ditado);
        System.out.println(ditado.toLowerCase());
        System.out.println(ditado.toUpperCase());
    }

    private static void exercicioSubstring() {
        //Substring - Primeiro caracter de um texto
        String texto = "Filho de peixe, peixinho é";
        System.out.println(texto);

        //Primeira letra = .substring(0, 1)
        //A partir da segunda letra = .substring(1)
        //Da letra 10 até a 20: .substring(10, 20)
        String primeiraLetra = texto.substring(0, 1);
        System.out.println("Inicial: "+primeiraLetra);
    }

    public static void exercicioString(){
        //Split - quebra CSV (nome,idade)
        // Gilberto,33
        String csv = "Gilberto,33;Rua Borges De Medeiros-75;(51) 9929394";
        String[] partesCsv = csv.split("[,;]"); //Regex: [,;] quer dizer "," OU ";"
        for (String parte : partesCsv){
            System.out.println("Parte: "+parte);
        }
    }
}

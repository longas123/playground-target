package colecoes;


import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ExericiosColecoesMap {

    public static void main(String[] args) throws IOException {

        //buscando o arquivo com scanner
        //Com java.nio
        Scanner sc = new Scanner(Path.of("src/main/resources/campeoes.csv"));//Aqui é para encontrar o caminho do arquivo
        String linha;
        linha = sc.nextLine();
        System.out.println();
        int i = 0;

        Map<String, Integer> campeao = new LinkedHashMap<>(); //vai organizar os elementos
        ArrayList<String> paisesRepetidos = new ArrayList<>();
        ArrayList<Integer> vitoria = new ArrayList<>();

        do {
            linha = sc.nextLine(); // Troca e retorna a nova linha
            String[] quebra = linha.split("-");//tira as virgulas com o split e o array quebra recebe os valores
            String pais = quebra[1];
            paisesRepetidos.add(pais);
        } while (sc.hasNextLine());//verifica se tem algo na próxima linha

        for (String lang : paisesRepetidos) {
            vitoria.add(Collections.frequency(paisesRepetidos, lang));//conta quantas vezes repete a variável no array
            Integer valorAtual = vitoria.get(i);
            campeao.put(lang, valorAtual);
            i++;
        }

        for (Map.Entry<String, Integer> entryCampeao : campeao.entrySet()) {
            System.out.printf(" Pais: %s - Vitorias: %s\n ", entryCampeao.getKey(), entryCampeao.getValue());
        }

        Collections.sort(paisesRepetidos);

        System.out.println("_____________________________");
        System.out.println("Paises Ordenados");

        for(String paisesOrdenado : paisesRepetidos){
            System.out.println(paisesOrdenado);
        }
      }

     }


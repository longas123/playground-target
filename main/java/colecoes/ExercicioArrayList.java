package colecoes;

import java.util.*;

public class ExercicioArrayList {

    public static void main(String[] args) {
//        Exercício 1 - Práticas coleções List/Set:
//        Crie uma lista vazia chamada pessoas.
//        Adicione os nomes: Kiersten, Zaneta, Frank, Tedi, Bryana, Marigold, Devan,
//        Jerrilyn, Isac, Kathrine, Bryana.Ignore as repetições.
//        Adicione programaticamente os primeiros 3 nomes (após ordenar)
//        a uma segunda lista chamada primeiros.

        //Mutável, normal :)
//        List<String> pessoas = new LinkedList<>();
//        pessoas = Arrays.asList("Kiersten","Zaneta", "Frank", "Tedi");

        //Mutável, normal :)
//        List<String> pessoas = new LinkedList<>();
//        pessoas = List.of("Kiersten","Zaneta", "Frank", "Tedi");

        HashSet<String> pessoas = new HashSet<>();
        //Set<String> pessoas = new HashSet<>();

        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Marigold");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        for(String x : pessoas){
            System.out.println(x);
        }

        System.out.println("---------------------------");

        Iterator<String> x = pessoas.iterator();
        int i = 0;
        while (x.hasNext()){
            i++;
            if(i >= 4){
                break;
            }
            System.out.println(x.next());
        }



    }
}

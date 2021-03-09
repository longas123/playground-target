package colecoes.exercicioordenacao2;

import java.util.*;

public class AplicacaoDeDespesas {


    public static void main(String[] args) {

//        List<Produto> produtos = Arrays.asList()

        Produto produto1 = new Produto("Creme Dental", 2.49F, 2.99F);
        Produto produto2 = new Produto("Sabonete em Barra Corporal", 2.99F, 33.30F);
        Produto produto3 = new Produto("Protetor Solar 30 FPS 200ml", 37.39F, 39.12F);
        Produto produto4 = new Produto("Fralda P Confort - 50 Unidades", 44.90F, 44.90F);
        Produto produto5 = new Produto("Condicionador 200ml", 18.90F, 15.00F);

        List<Produto> descricao = new LinkedList<>();
        descricao.add(produto1);
        descricao.add(produto2);
        descricao.add(produto3);
        descricao.add(produto4);
        descricao.add(produto5);

        Collections.sort(descricao);

        System.out.println("Ordenada por nome");
        for(Produto produto : descricao){
            System.out.println(produto.getDescricao());
        }

        Collections.sort(descricao, new ProdutoPorCustoAquisicaoComparator());//Comparator

        System.out.println("\nOrdenação por Valor:");
        for (Produto desp : descricao){
            System.out.println(desp.getDescricao());
        }

        Collections.sort(descricao, new LucroPorProdutoComparator());//Comparator


        System.out.println("\nOrdenação Lucro:");
        for (Produto desp : descricao){
            System.out.println(desp.getDescricao());
        }


//        Creme Dental 90g, R$ 2,49, R$ 2,99
//        Sabonete em Barra Corporal 90g, R$ 2,99, R$ 3,30
//        Protetor Solar 30 FPS 200ml, R$ 37,39, R$ 39,12
//        Fralda P Confort - 50 Unidades, R$ 44,90, R$ 44,90
//        Condicionador 200ml, R$ 18,90, R$ 15,00

    }
}

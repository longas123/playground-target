package colecoes.exercicioordenacao2;

import java.util.Comparator;

public class LucroPorProdutoComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1 == null){
            return 1;
        }
        if(o2 == null){
            return -1;
        }
        return o1.getLucro().compareTo(o2.getLucro());
    }

}

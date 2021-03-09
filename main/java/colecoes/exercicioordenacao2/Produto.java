package colecoes.exercicioordenacao2;

public class Produto implements Comparable<Produto>{


    private String produto;
    private Float valor1;
    private Float valor2;

    public Produto(String produto, Float valor1, Float valor2){
        this.produto = produto;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String getDescricao(){
        return String.format("Produto %s - Valor: %s - Lucro: %.2f\n", this.produto, this.valor1, getLucro());
    }

    public Float getValor1() {
        return valor1;
    }

    public Float getLucro() {
        if(valor2 == null){
            return 0F;
        }
        if(valor1 == null){
            return valor2;
        }
        return valor2 - valor1;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        if(this.produto == null){
            return 1;
        }
        if(outroProduto.produto == null || outroProduto.produto ==null){
            return -1;
        }
        return this.produto.compareToIgnoreCase(outroProduto.produto);
    }
}

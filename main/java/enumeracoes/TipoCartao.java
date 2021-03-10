package enumeracoes;

import enumeracoes.avancado.TipoMovimento;

public enum TipoCartao {
    BLACK(1.98F),
    GOLD(3.05F),
    PREMIUM(2.95F),
    STANDARD(3.05F);

    public float taxaJuros;

    TipoCartao(float taxaJuros){
        this.taxaJuros = taxaJuros;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public static TipoCartao obtemAPartirDaSigla(float valor) {
        for (TipoCartao tipo : TipoCartao.values()) {
            if (tipo.getTaxaJuros() == valor) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo não encontrado");
    }
}

package enumeracoes;

public class TaxaDeJuros {

    public static float taxaJuros(TipoCartao tipoCartao){
        switch (tipoCartao){
            case STANDARD:
                return 3.5F;
            case GOLD:
                return 3.5F;
            case PREMIUM:
                return 2.95F;
            case BLACK:
                return 1.98F;
            default:
                throw new IllegalArgumentException("Tipo não configurado!");
        }


    }
}

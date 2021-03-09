package enumeracoes.avancado;

public class TarifaMovimento {

    public float valorTarifa(TipoMovimento tipoMovimento){


            switch (tipoMovimento){
                case DEBITO:
                    return 1.5F;
                case CREDITO:
                    return 6.5F;
                case SAQUE:
                    return 3.0F;
                default:
                    throw new IllegalArgumentException("Tipo não configurado!");
            }
        }

//    public float valorTarifa(TipoMovimento tipoMovimento){
//
//        //Podem usar o == pra comparar enum
//        if(tipoMovimento == TipoMovimento.DEBITO){
//            return 1.5F;
//        }else if(tipoMovimento == TipoMovimento.CREDITO) {
//            return 6.5F;
//        }else if(tipoMovimento == TipoMovimento.SAQUE) {
//            return 3.0F;
//        }else{
//            throw new IllegalArgumentException("Tipo não configurado!");
//        }
//    }
}

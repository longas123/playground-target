package exceptions.exemplos;


/*
 CHECKED - Exception - sou obrigado a declarar
 Usos: Quem chama tem que tomar uma ação (ex: Recurso Nao Existe)
 */
public class ExemploExcecaoChecked {
    public static void main(String[] args) throws Exception {//Declara que PODE lançar Exception
        metodoA();
    }

    public static void metodoA() throws Exception {//Declara que PODE lançar Exception
        System.out.println("Método A");
        metodoB();
    }

    public static void metodoB() throws Exception {//Declara que PODE lançar Exception
        System.out.println("Método B");
//        Exception minhaExcecao = new Exception();
//        throw minhaExcecao;

        //if(algumaRegra)
        throw new Exception("Método não deve ser executado"); //Cria e lança uma Exception!
    }
}
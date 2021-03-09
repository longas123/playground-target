package exceptions.exemplos;


/*
 UNCHECKED - RuntimeException - silenciosa
 Usos: Família Principal de Exceptions
 */
public class ExemploExcecaoUnchecked {
    public static void main(String[] args){
        metodoA();
    }


    public static void metodoA() {
        System.out.println("Método A");
        metodoB();
    }

    public static void metodoB() {
        System.out.println("Método B");
        throw new RuntimeException("Método não deve ser executado");
    }
}
package introducao;

public class InformacoesSistema {

    //Atalho digite psvm
    public static void main(String[] args) {

        System.out.println("Processadores disponíveis");
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.print("Máximo de Memória utilizado pela JVM (HEAP): ");
        System.out.printf("%d MB \n",Runtime.getRuntime().maxMemory()/1024/1024);

        System.out.print("Memória utilizado pela JVM (HEAP): ");
        System.out.printf("%d MB \n",Runtime.getRuntime().totalMemory()/1024/1024);
    }

}

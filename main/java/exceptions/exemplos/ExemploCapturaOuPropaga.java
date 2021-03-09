package exceptions.exemplos;

import java.io.IOException;

public class ExemploCapturaOuPropaga {

    public static void main(String[] args) {
        metodoA();
        System.out.println("Finalizou com sucesso!");
    }

    private static void metodoA(){//vai tratar com TRY/CATCH
        try{
            metodoB(); //Está dentro do try, ou seja, é excecutado com "cuidado" pelo Java
        }catch (IOException e){//Exceção específica (filha de Exception) - captura
            //faça isso se acontecer IOException
            System.out.println(e.getMessage());
            e.printStackTrace();//Não usar no WEB, só em CONSOLE
        }catch (Exception e){ //Segura qualquer exceção pois todas as exceções são filhas de Exception - captura
            //faça isso se acontecer Exception
            System.out.println(e.getMessage());
            e.printStackTrace();//Não usar no WEB, só em CONSOLE
        }
    }

    private static void metodoB() throws Exception, IOException {//propagou
        throw new Exception("Deu ruim aqui...");
        //throw new IOException("Deu ruim aqui...");
    }
}
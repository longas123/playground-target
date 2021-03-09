package exceptions.exemplos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class AlternativasDentroDoTryCatch {

    public static void main(String[] args) {

        try{
            metodoQueLancaExcecao();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //Use o multi-catch - para exceptions genéricas e mesmo tratamento

        try{
            metodoQueLancaExcecao();
        }catch (IOException | SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Se finalizar com sucesso OU não, finally

        Scanner scanner = new Scanner(System.in);
        try{
            scanner.nextLine();
            metodoQueLancaExcecao();
        }catch (IOException | SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally { //fechar coisas que ficaram abertas/em uso em caso de sucesso ou falha
            scanner.close();
        }

        //Try-Catch - TRY-WITH-RESOURCES -> Auto closable = chama sozinho o .close().
        try (Scanner scannerClosable = new Scanner(System.in)){
            scanner.nextLine();
            metodoQueLancaExcecao();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void metodoQueLancaExcecao() throws SQLException, IOException{
    }
}
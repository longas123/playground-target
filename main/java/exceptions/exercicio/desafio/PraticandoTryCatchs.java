package exceptions.exercicio.desafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

//1 - Trate as exceções a seguir:
public class PraticandoTryCatchs {

    //Não altere esse método, somente dentro dos métodos internos
    public static void main(String args[]) {
        excecoesNumericas();
        nullPointerException();
        indexOfBounds();
        arquivoInexistente();
        erroDeConversao();
        argumentoObrigatorio();
        multiplasExcecoes();
    }

    private static void erroDeConversao() {
        int num = 0;
        try {
            num = Integer.parseInt("zero");
        } catch (NumberFormatException e) {
            System.err.printf("Não é um número: %s \n", e.getMessage());
        }
        System.out.println(num);
    }

    private static void arquivoInexistente() {

        //Estou apenas "definindo" qual arquivo vou abrir
        File file = new File("E://arquivo.txt");

        //Try-with-resources que chama o .close() que pode disparar o IOException!
        // ... e o new FileReader(file) pode disparar FileNotFoundException
        try(FileReader fr = new FileReader(file)){
            //fr.close();

        }catch (FileNotFoundException e){
            System.err.printf("Arquivo não encontrado. Detalhes: %s \n", e.getMessage());

        }catch (IOException e){
            System.err.printf("Erro ao fechar. Detalhes: %s \n", e.getMessage());
        }
    }

    private static void indexOfBounds() {
        String e = "Imersao Java";
        if(e.length() > 29){
            char f = e.charAt(29);
            System.out.println(e);
        }else {
            System.err.println("Não foi possível obter o caractere 29!");
        }
    }

    private static void nullPointerException() {
        String d = null;
        if(d == null){
            System.err.println("Não há posição 0 na variável!");
            return;
        }
        System.out.println(d.charAt(0));

//        try {
//            System.out.println(d.charAt(0));
//        }catch (NullPointerException e){
//            System.err.println("Não há posição 0 na variável!");
//        }
    }

    private static void excecoesNumericas() {
        int a = 30, b = 0, c = 0;
        try {
            c = a / b;
        }catch (ArithmeticException e){ // Poderia ou Deveria ser um IF, já que é fácil tratar.
            System.err.println("Não pode ser dividido por zero!");
            return;
        }
        System.out.println ("Resultado = " + c);
    }

    private static void argumentoObrigatorio(){
        try {
            metodoDisparaIllegal();
        }catch (IllegalArgumentException e){
            System.err.println("Ocorreu uma Illegal");
        }
    }

    private static void multiplasExcecoes() {
        //trate com vários catchs separados
        try{
            metodoDisparaSql();
            metodoDisparaIOException();

        }catch (IOException e){
            System.err.println("Erro de IO");

        }catch (SQLDataException e){
            System.err.println("Erro na execução do SQL");
        }
    }

    private static void multiplasExcecoesMultiCatch() {
        //trate com apenas um multi-catch
        try {
            metodoDisparaSql();
            metodoDisparaIOException();

        }catch (IOException | SQLException e){
            System.err.println("Erro na execução!");
        }
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIllegal() {
        throw new IllegalArgumentException();
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIOException() throws IOException {
        throw new IOException();
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaSql() throws SQLDataException {
        throw new SQLDataException();
    }
}
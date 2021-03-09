package strings.stringbuilder;

import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;

public class ExercicioSalariosFuncionarios {


    public static void main(String[] args) throws IOException  {


        Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv"));//Aqui é para encontrar o caminho do arquivo
        String linha;
        linha = sc.nextLine();
        System.out.println();


        do{
            linha = sc.nextLine(); // Troca e retorna a nova linha
            String[] quebra = linha.split(",");//tira as virgulas com o split e o array quebra recebe os valores
            float salario = (Float.parseFloat(quebra[3]));
            float beneficio = (Float.parseFloat(quebra[4]));
            StringBuilder builder = new StringBuilder();
            builder
                .append(quebra[1] + " ")
                .append(quebra[2] + "\n Salario: ")
                .append(salario + beneficio);
                //.append(quebra[4]) ;
                System.out.println(builder.toString());
        }while(sc.hasNextLine());//verifica se tem algo na próxima linha


    }
}





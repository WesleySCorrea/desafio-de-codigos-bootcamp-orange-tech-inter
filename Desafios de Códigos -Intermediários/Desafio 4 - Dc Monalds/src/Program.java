import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String[] listaIngredientes = ingredientes.split(";");

        for ( String x : listaIngredientes) {
            System.out.println(x);
        }
    }
}
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String[] array = frase.split("/");

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
    }
}
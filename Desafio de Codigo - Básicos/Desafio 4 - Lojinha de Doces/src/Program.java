import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        int totalDeDoces = dinheiro * 2;

        System.out.println("O cliente obteve " + totalDeDoces + " doces");
    }
}
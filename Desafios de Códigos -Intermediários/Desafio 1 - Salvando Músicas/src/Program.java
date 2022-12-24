import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        String[] tipoDoArquivo = arquivoDoPc.split("\\.");

        System.out.println((tipoDoArquivo[1].equals("mp3")) ? "Salvar" : "Deletar");
    }
}
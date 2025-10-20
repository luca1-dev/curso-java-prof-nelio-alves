import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.next();
        System.out.println(nome + ", o mais brabo. Vai Corinthians!");
    }
}

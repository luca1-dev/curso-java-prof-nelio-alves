
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, totalDiferenca;

        System.out.print("Digite o numero A: ");
        a = sc.nextInt();
        System.out.print("Digite o numero B: ");
        b = sc.nextInt();
        System.out.print("Digite o numero C: ");
        c = sc.nextInt();
        System.out.print("Digite o numero D: ");
        d = sc.nextInt();

        totalDiferenca = (a * b) - (c * d);

        System.out.println("DIFERENÇA: " + totalDiferenca);

        sc.close();
    }
}

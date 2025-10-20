import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y, total;
        System.out.print("Digite um numero: ");
        x = sc.nextInt();
        System.out.print("Digite outro numero: ");
        y = sc.nextInt();

        total = x + y;

        System.out.printf("SOMA = %d%n", total);

        sc.close();
    }
}

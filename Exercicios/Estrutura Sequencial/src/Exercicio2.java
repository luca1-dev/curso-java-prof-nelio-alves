
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, PI, area;

        PI = 3.14159;
        System.out.print("Digite um numero de ponto flutuante (2,15): ");
        x = sc.nextDouble();

        area = (double) PI * (Math.pow(x, 2.0));

        System.out.printf("AREA = %.4f%n", area);
        sc.close();
    }
}

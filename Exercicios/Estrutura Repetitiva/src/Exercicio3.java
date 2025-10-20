import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x, y, z, media;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            x *= 2;
            y *= 3;
            z *= 5;

            media = (x + y + z) / 10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}

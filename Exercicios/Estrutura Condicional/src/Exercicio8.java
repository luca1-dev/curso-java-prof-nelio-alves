import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double total = 0;

        if (x > 0 && x <= 2000){
            System.out.println("Isento");
        } else if (x > 2000 && x <= 3000){
            total = (x - 2000) * 0.08;
            System.out.println("R$ " + total);
        } else if (x > 3000 && x <= 4500){
            total = (x - 3000) * 0.18;
            total += 80;
            System.out.println(total);
        } else if (x > 4500) {
            total = (x - 4500) * 0.28;
            total = 80 + 270;
            System.out.println(total);
        }

        sc.close();
    }
}

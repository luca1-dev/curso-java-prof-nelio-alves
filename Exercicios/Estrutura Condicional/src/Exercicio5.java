import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int order, quantity;
        double total;

        order = sc.nextInt();
        quantity = sc.nextInt();

        if (order == 1) {
            total = quantity * 4.00;
        } else if (order == 2) {
            total = quantity * 4.50;
        } else if (order == 3) {
            total = quantity * 5.00;
        } else if (order == 4) {
            total = quantity * 2.00;
        } else if (order == 5) {
            total = quantity * 1.50;
        }else {
            total = 0.0;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}

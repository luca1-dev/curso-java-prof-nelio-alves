import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        double total;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0){
                System.out.println("divisão impossivel");
            }else {
                total = (float) x / y;
                System.out.println(total);
            }
        }
        sc.close();
    }
}

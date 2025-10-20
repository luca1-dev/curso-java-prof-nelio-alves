import java.util.Scanner;

public class Exercicio5 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = (n == 0)? 1: n;
        for (int i = 1; i < n; i++) {
            total *= i;
        }
        System.out.println(total);

        sc.close();
    }
}

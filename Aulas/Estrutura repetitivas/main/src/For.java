import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int soma = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        sc.close();
    }
}

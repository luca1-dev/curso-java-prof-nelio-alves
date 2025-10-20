import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System .in);
        int comeco, fim, total;
        total = 0;

        comeco = sc.nextInt();
        fim = sc.nextInt();

        if (comeco == fim){
            total = 24;
        } else if (comeco > fim) {
            total = 24 + (fim - comeco);
        } else {
            total = fim - comeco;
        }
        System.out.printf("O jogo durou %d hora(s).%n", total);
        sc.close();
    }
}

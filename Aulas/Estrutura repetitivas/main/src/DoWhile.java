import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temperaturaC, temperaturaF;
        char pause;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaC = sc.nextDouble();
            temperaturaF = ((temperaturaC * 9) / 5) + 32.0;
            System.out.println("Equivalente em Fahrenheit: " + temperaturaF );
            System.out.print("Deseja repetir (s/n)? ");
            pause = sc.next().toLowerCase().charAt(0);
        } while (pause == 's');
        sc.close();
    }
}

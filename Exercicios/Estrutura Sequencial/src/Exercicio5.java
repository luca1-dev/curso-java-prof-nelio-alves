import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codePiece1, numberPiece1, codePiece2, numberPiece2;
        double valuePiece1, valuePiece2, totalValuePiece1, totalValuePiece2, totalForAPay;
        
        System.out.print("Digite o codigo, numero e o valor da peça 1: ");
        codePiece1 = sc.nextInt();
        numberPiece1 = sc.nextInt();
        valuePiece1 = sc.nextDouble();
        
        System.out.print("Digite o codigo, numero e o valor da peça 2: ");
        codePiece2 = sc.nextInt();
        numberPiece2 = sc.nextInt();
        valuePiece2 = sc.nextDouble();

        totalValuePiece1 = numberPiece1 * valuePiece1;
        totalValuePiece2 = numberPiece2 * valuePiece2;

        totalForAPay = totalValuePiece1 + totalValuePiece2;

        System.out.printf("TOTAL = R$ %.2f%n", totalForAPay);

        sc.close();
    }
}

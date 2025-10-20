
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, triangle, circle, trapeze, square, retangle;
        double PI = 3.14159;

        System.out.print("Digite a aréa (3.0 4.0 5.2): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangle = (a * c) / 2;
        circle = Math.pow(c, 2.0) * PI;
        trapeze = ((a + b) * c) / 2;
        square =  b * b;
        retangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangle); 
        System.out.printf("CIRCULO: %.3f%n", circle); 
        System.out.printf("TRAPEZIO: %.3f%n", trapeze); 
        System.out.printf("QUADRADO: %.3f%n", square); 
        System.out.printf("RETANGULO: %.3f%n", retangle);
        
        sc.close();
    }
}

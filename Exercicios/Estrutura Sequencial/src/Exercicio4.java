
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberEmployee, hoursWorked;
        double employeeReceivedForHour, salaryEmployee;
        
        System.out.print("Numero do funcionario: ");
        numberEmployee = sc.nextInt();
        System.out.print("Quantas horas ele trabalhou: ");
        hoursWorked = sc.nextInt();
        System.out.print("Quanto o funcionario recebe por hora: ");
        employeeReceivedForHour = sc.nextDouble();

        salaryEmployee = hoursWorked * employeeReceivedForHour;

        System.out.println("NUMBER = " + numberEmployee);
        System.out.printf("SALARY = R$ %.2f%n", salaryEmployee);        

        sc.close();
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();

        System.out.println("Digite o nome do empregado: ");
        empregado.name = sc.nextLine();
        System.out.println("Digite o salario bruto: ");
        empregado.salary = sc.nextDouble();
        System.out.println("Digite a taxa: ");
        empregado.tax = sc.nextDouble();

        System.out.println(empregado);

        double porcentagem;
        System.out.println("Digite a porcentagem para aumentar salario:");
        porcentagem = sc.nextDouble();
        empregado.increaseSalary(porcentagem);
        System.out.println("Updated data: " + empregado);

        sc.close();
    }
}

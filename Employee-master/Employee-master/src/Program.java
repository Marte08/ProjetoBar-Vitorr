import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Define a localidade para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do funcionário
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Salário bruto: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Imposto: ");
        double tax = scanner.nextDouble();

        // Criação do objeto Employee
        Employee employee = new Employee(name, grossSalary, tax);

        // Exibição dos dados do funcionário
        System.out.println(employee);

        // Leitura da porcentagem para aumento
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = scanner.nextDouble();

        // Aumento do salário
        employee.increaseSalary(percentage);

        // Exibição dos dados atualizados
        System.out.println(employee.toStringUpdated());

        scanner.close();
    }
}
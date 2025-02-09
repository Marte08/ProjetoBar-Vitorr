public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getNetSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Funcionário: " + name + ", $ " + String.format("%.2f", getNetSalary());
    }

    public String toStringUpdated() {
        return "Dados atualizados: " + name + ", $ " + String.format("%.2f", getNetSalary());
    }
}
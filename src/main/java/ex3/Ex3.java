package ex3;

public class Ex3 {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Davi", "Soares", 2000.0);
        Empregado emp2 = new Empregado("Fernando", "Alonso", 55019.97);

        System.out.printf("Ganho anual de %s é %.2f%n", emp1.getFirstName(), emp1.annualIncome());
        System.out.printf("Ganho anual de %s é %.2f%n", emp2.getFirstName(), emp2.annualIncome());
    }
}

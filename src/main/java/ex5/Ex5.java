package ex5;

public class Ex5 {
    public static void main(String[] args) {
        try {
            Date Date1 = new Date(25, 12, 2023);
            System.out.println("Date inicial: " + Date1);

            Date1.avancarData();
            System.out.println("Após avançar 1 dia: " + Date1);
            Date1.avancarData();
            System.out.println("Após avançar mais 1 dia: " + Date1);

            Date Date2 = new Date(30, 4, 2023);
            System.out.println("Date inicial: " + Date2);
            Date2.avancarData();
            System.out.println("Após avançar 1 dia: " + Date2);

            Date Date3 = new Date(31, 12, 2023);
            System.out.println("Date inicial: " + Date3);
            Date3.avancarData();
            System.out.println("Após avançar 1 dia: " + Date3);

            Date Date4 = new Date(29, 2, 2023);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Date Date5 = new Date(29, 2, 2024);
            System.out.println("Date válida (ano bissexto): " + Date5);
            Date5.avancarData();
            System.out.println("Após avançar 1 dia: " + Date5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

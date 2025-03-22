package ex2;

public class Ex2 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Computer", 2, 3000.0);
        System.out.println(invoice.getInvoiceAmount());
    }
}
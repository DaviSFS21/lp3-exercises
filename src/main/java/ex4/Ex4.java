package ex4;

public class Ex4 {
    public static void main(String[] args) {
        Complex z1 = new Complex(3.0, 4.0);
        Complex z2 = new Complex(1.0, 2.0);
        Complex z3 = new Complex(5.0);
        Complex z4 = new Complex();

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("z3 = " + z3);
        System.out.println("z4 = " + z4);

        System.out.println("Módulo de z1: " + z1.getModulo());
        System.out.println("Ângulo de z1: " + z1.getAngulo());

        System.out.println("Inverso aditivo de z1: " + z1.inversoAditivo());

        System.out.println("z1 + z2 = " + z1.adicionar(z2));
        System.out.println("z1 - z2 = " + z1.subtrair(z2));
        System.out.println("z1 * z2 = " + z1.multiplicar(z2));
        System.out.println("z1 / z2 = " + z1.dividir(z2));
    }
}

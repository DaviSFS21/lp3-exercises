package ex4;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Complex {
    Double real;
    Double imaginaria;

    public Complex() {
        this.real = 0.0;
        this.imaginaria = 0.0;
    }

    public Complex(Double real) {
        this.real = real;
        this.imaginaria = 0.0;
    }

    public Complex(Double real, Double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public Double getModulo() {
        return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginaria(), 2));
    }

    public Double getAngulo() {
        return Math.atan2(this.getImaginaria(), this.getReal());
    }

    public Complex inversoAditivo() {
        return new Complex(-this.getReal(), -this.getImaginaria());
    }

    public Complex adicionar(Complex complex2) {
        return new Complex(this.getReal() + complex2.getReal(), this.getImaginaria() + complex2.getImaginaria());
    }

    public Complex subtrair(Complex complex2) {
        return new Complex(this.getReal() - complex2.getReal(), this.getImaginaria() - complex2.getImaginaria());
    }

    public Complex multiplicar(Complex complex2) {
        double novaReal = this.getReal() * complex2.getReal() - this.getImaginaria() * complex2.getImaginaria();
        double novaImaginaria = this.getReal() * complex2.getImaginaria() + this.getImaginaria() * complex2.getReal();
        return new Complex(novaReal, novaImaginaria);
    }

    public Complex dividir(Complex complex2) {
        double denominador = Math.pow(complex2.getReal(), 2) + Math.pow(complex2.getImaginaria(), 2);
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        double novaReal = (this.getReal() * complex2.getReal() + this.getImaginaria() * complex2.getImaginaria()) / denominador;
        double novaImaginaria = (this.getImaginaria() * complex2.getReal() - this.getReal() * complex2.getImaginaria()) / denominador;
        return new Complex(novaReal, novaImaginaria);
    }

    @Override
    public String toString() {
        if (this.getReal() == 0) {
            if (this.getImaginaria() == 0) {
                return "0";
            }
            if (this.getImaginaria() == 1) {
                return "i";
            }
            if (this.getImaginaria() == -1) {
                return "-i";
            }
            return this.getImaginaria() + "i";
        }

        if (this.getImaginaria() == 0) {
            return String.valueOf(this.getReal());
        }

        if (this.getImaginaria() > 0) {
            if (this.getImaginaria() == 1) {
                return this.getReal() + " + i";
            }
            return this.getReal() + " + " + this.getImaginaria() + "i";
        } else {
            if (this.getImaginaria() == -1) {
                return this.getReal() + " - i";
            }
            return this.getReal() + " - " + Math.abs(this.getImaginaria()) + "i";
        }
    }
}

package ex4;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Complex {
    Double real;
    Double imaginaria;

    public Complex () {
        this.real = 0.0;
        this.imaginaria = 0.0;
    }

    public Complex (Double real) {
        this.real = real;
    }

    public Complex (Double real, Double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public Double getModulo() {
        return Math.abs(Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginaria(), 2)));
    }

    public Double getAngulo() {
        return Math.atan(this.getImaginaria() / this.getReal());
    }

    @Override
    public String toString() {
        if (this.getReal() == 0) {
            return this.getImaginaria() + "i";
        }
        return this.getReal() + " + " + this.getImaginaria() + "i";
    }
}

package ex3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Empregado {
    private String firstName;
    private String lastName;
    private Double monthlySalary;

    public Empregado (String firstName, String lastName, Double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary < 0) ? 0 : monthlySalary;
    }

    public Double annualIncome() {
        return getMonthlySalary() * 12;
    }
}

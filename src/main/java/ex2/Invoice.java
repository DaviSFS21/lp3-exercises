package ex2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    private UUID id;
    private String description;
    private Integer quantity;
    private Double price;

    public Invoice (String description, Integer quantity, Double price) {
        this(UUID.randomUUID(), description, quantity, (price < 0) ? 0 : price);
    }

    public double getInvoiceAmount() {
        return this.quantity * this.price;
    }
}

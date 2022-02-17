package domain.salesystem;

import domain.productsystem.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter

public class SalesLineItem {
    private int itemID;
    private int count;
    private Sale sale;
    private Product product;
}
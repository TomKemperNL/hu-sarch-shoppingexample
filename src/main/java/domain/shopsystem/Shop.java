package domain.shopsystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter

public class Shop {
    private int shopID;
    private String name;
    private String fullAddress;
}
package domain.customersystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private int addressID;
    private String firstLine;
    private String secondLine;
    private Customer customer;
}
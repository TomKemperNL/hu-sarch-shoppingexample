package domain.customersystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter

public class Customer {
    private int customerID;
    private String companyName;
    private String contactName;
    private ArrayList<Address> addressList;
}
package domain.customersystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private int customerID;
    private String companyName;
    private String contactName;
    private ArrayList<Address> addressList;

    @Override
    public String toString() {
        String str = "Customer [customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName;
        for (Address ad : addressList)
            str = str + "\n      " + ad;
        return str + "]";
    }

}
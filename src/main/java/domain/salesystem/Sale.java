package domain.salesystem;

import domain.customersystem.Customer;
import domain.shopsystem.Shop;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;


@Getter
@Setter
@ToString
public class Sale extends Transaction {
    private int invoiceID;
    private Date invoiceDate;
    private int status;
    private double totalAmount;
    domain.shopsystem.Shop seller;
    domain.customersystem.Customer buyer;
    ArrayList<SalesLineItem> items;

    public Sale() {
        super();
    }

    public Sale(int invoiceID, Date invoiceDate, int status, Shop seller, Customer buyer) {
        super();
        this.invoiceID = invoiceID;
        this.invoiceDate = invoiceDate;
        this.status = status;
        this.seller = seller;
        this.buyer = buyer;
        this.items = new ArrayList<SalesLineItem>();
        this.totalAmount = 0.0;
    }

    public void addItem(SalesLineItem item) {
        items.add(item);
        calculateTotal();
    }

    public void calculateTotal() {
        totalAmount = 0.0;
        for (SalesLineItem item : getItems())
            totalAmount = totalAmount + (item.getCount() * item.getProduct().getPrice());
        totalAmount = Math.round(totalAmount * 100.0) / 100.0;
        //here is space to add discounts, taxes, etc.
    }
}
package domain.salesystem;

import java.util.*;
import domain.customersystem.*;
import domain.shopsystem.*;

public class Sale extends Transaction {
	private int invoiceID; 
	private Date invoiceDate; 
	private int status; 
	private double totalAmount; 
	domain.shopsystem.Shop seller;
	domain.customersystem.Customer buyer;
	ArrayList<SalesLineItem> items;
	
	public Sale( ) {
		super();
	}
	
	public Sale(int invoiceID, Date invoiceDate, 
				   int status, Shop seller, Customer buyer) {
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
	
	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Shop getSeller() {
		return seller;
	}

	public void setSeller(Shop seller) {
		this.seller = seller;
	}

	public Customer getBuyer() {
		return buyer;
	}

	public void setBuyer(Customer buyer) {
		this.buyer = buyer;
	}

	public ArrayList<SalesLineItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		String str =  "Sale [ID=" + invoiceID + ", Date=" + invoiceDate + ", status=" + status + ", Bedrag=" + totalAmount
				+ ",\n   " + seller + ",\n   " + buyer;
		for (SalesLineItem item : items)
			str = str + "\n   " + item; 
		return str + "]"; 
	}
}
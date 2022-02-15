package domain.salesystem;

import domain.productsystem.*;

public class SalesLineItem {
	private int itemID; 
	private int count; 
	private Sale sale;
	private Product product;
	
	public SalesLineItem(int itemID, int count, Sale sale, Product product) {
		this.itemID = itemID;
		this.count = count;
		this.sale = sale;
		this.product = product;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "SalesLineItem [itemID=" + itemID + ", count=" + count + 
				//", sale=" + sale + 
				", " + product + "]";
	}
	

}
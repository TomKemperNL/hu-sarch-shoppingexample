package domain.customersystem;

public class Address {
	private int addressID; 
	private String firstLine; 
	private String secondLine; 
	private Customer customer;
	
	public Address(int addressID, String firstLine, String secondLine, Customer customer) {
		this.addressID = addressID;
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.customer = customer;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", firstLine=" + firstLine + ", secondLine=" + secondLine
				//+ ", customer=" + customer 
				+ "]";
	}
	
	

}
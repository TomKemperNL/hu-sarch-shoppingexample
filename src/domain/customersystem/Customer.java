package domain.customersystem;

import java.util.*;

public class Customer {
	private int customerID; 
	private String companyName; 
	private String contactName ;
	private ArrayList<Address> addressList;
	
	public Customer(int customerID, String companyName, String contactName, ArrayList<Address> addressList) {
		this.customerID = customerID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.addressList = addressList;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public ArrayList<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		String str = "Customer [customerID=" + customerID + ", companyName=" 
					 + companyName + ", contactName=" + contactName; 
		for (Address ad : addressList)
			str = str + "\n      " + ad; 
		return str + "]";
	}

}
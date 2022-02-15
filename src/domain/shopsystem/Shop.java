package domain.shopsystem;

public class Shop {
	private int shopID; 
	private String name;
	private String fullAddress;
	
	public Shop(int shopID, String name, String fullAddress) {
		this.shopID = shopID;
		this.name = name;
		this.fullAddress = fullAddress;
	}
	
	public int getShopID() {
		return shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Shop [shopID=" + shopID + ", name=" + name + ", fullAddress=" + fullAddress + "]";
	} 
}
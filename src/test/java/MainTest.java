import java.util.ArrayList;

import domain.customersystem.Address;
import domain.customersystem.Customer;
import domain.productsystem.Product;
import domain.salesystem.Sale;
import domain.salesystem.SalesLineItem;
import domain.shopsystem.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Shop example
 *
 * This example is coded for the SARCH assignment about Packages and Dependencies
 * It is a simulation and contains the minimum needed for the assignment.  
 *
 */

public class MainTest {

	private Shop shop;
	private Customer cust;

	@BeforeEach
	public void setup(){
		shop = new Shop( 10, "Beverages Utrecht Uithof", "Daltonlaan 200, 3500 AD Utrecht");
		cust = new Customer( 1, "Amerena", "Jan van Delden", null);
		ArrayList<Address> adList = new ArrayList<Address>();
		adList.add(new Address(1, "Langestraat 23", "3543 DR Utrecht", cust));
		adList.add(new Address(2, "Leusderweg 65", "3567 YU Utrecht", cust));
		cust.setAddressList(adList);
	}

	@Test
	public void sale(){
		Product product1 = new Product(1, "Coca Cola 12 bottles 1 litre", 48.95);
		Product product2 = new Product( 1, "Bitter Lemon 6 bottles 0.5 litre", 12.50);

		Sale sale = new Sale(1, java.sql.Date.valueOf("2022-02-04"), 1, shop, cust);
		sale.addItem(new SalesLineItem(1, 3, sale, product1));
		sale.addItem(new SalesLineItem(2, 5, sale, product2));		

		assertEquals(209.35, sale.getTotalAmount());
	}
}

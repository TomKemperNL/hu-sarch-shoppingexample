package test;

import java.util.ArrayList;

import domain.customersystem.Address;
import domain.customersystem.Customer;
import domain.productsystem.Product;
import domain.salesystem.Sale;
import domain.salesystem.SalesLineItem;
import domain.shopsystem.Shop;

/**
 * Shop example
 *
 * This example is coded for the SARCH assignment about Packages and Dependencies
 * It is a simulation and contains the minimum needed for the assignment.  
 *
 */

public class MainTest {

	public static void main(String[] args) {
		System.out.println("*** test begin\n"); 
		Sale sale = getSale(9); 
		System.out.println(sale); 
		System.out.println("\n*** test end"); 
	}
	
	private static Sale getSale(int id){
		Shop shop = new Shop( 10, "Beverages Utrecht Uithof", "Daltonlaan 200, 3500 AD Utrecht");

		Customer cust = new Customer( id, "Amerena", "Jan van Delden", null); 
		ArrayList<Address> adList = new ArrayList<Address>(); 
		adList.add(new Address(1, "Langestraat 23", "3543 DR Utrecht", cust));
		adList.add(new Address(2, "Leusderweg 65", "3567 YU Utrecht", cust));		
		cust.setAddressList(adList);

		Product product1 = new Product(1, "Coca Cola 12 bottles 1 litre", 48.95);
		Product product2 = new Product( id, "Bitter Lemon 6 bottles 0.5 litre", 12.50);
		
		Sale sale = new Sale(id, java.sql.Date.valueOf("2022-02-04"), 1, shop, cust); 
		sale.addItem(new SalesLineItem(1, 3, sale, product1));
		sale.addItem(new SalesLineItem(2, 5, sale, product2));		

		return sale; 
	}
}

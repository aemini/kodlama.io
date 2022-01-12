package coffeeshop.business;

import coffeeshop.models.Customer;

public class NeroCustomerManager extends CustomerManager {

	public void save(Customer customer) {
		System.out.println("Customer saved to Nero: " + customer.getFirstName());
	}

}

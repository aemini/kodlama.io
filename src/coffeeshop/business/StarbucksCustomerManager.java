package coffeeshop.business;

import coffeeshop.adapters.CitizenValidationService;
import coffeeshop.models.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	private final CitizenValidationService validationService;

	public StarbucksCustomerManager(CitizenValidationService validationService) {
		this.validationService = validationService;
	}

	public void save(Customer customer) {
		if (validationService.validate(customer)) {
			System.out.println("Customer saved to Starbucks: " + customer.getFirstName());
		} else {
			System.out.println("Customer is not a valid citizen!");
		}
	}

}

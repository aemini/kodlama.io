package coffeeshop;

import coffeeshop.business.CustomerManager;
import coffeeshop.business.NeroCustomerManager;
import coffeeshop.business.StarbucksCustomerManager;
import coffeeshop.models.Customer;
import commons.CitizenValidationService;
import services.MernisValidationService;

public class Main {

	private static CitizenValidationService validationService;

	public static void main(String[] args) {
		validationService = MernisValidationService.getInstance();
		/* OR
		 * validationService = new FakeValidationService();
		*/

		Customer customer = new Customer(12345678901L, "Cafer", "Bezgetiren", "1970-12-31");

		CustomerManager starbucks = new StarbucksCustomerManager(validationService);
		starbucks.save(customer);

		CustomerManager nero = new NeroCustomerManager();
		nero.save(customer);
	}

}

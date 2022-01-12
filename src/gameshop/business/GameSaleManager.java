package gameshop.business;

import gameshop.abstracts.Campaign;
import gameshop.abstracts.Customer;
import gameshop.abstracts.Salable;
import gameshop.abstracts.SaleManager;

public class GameSaleManager extends SaleManager {

	@Override
	public void sale(Salable salable, Customer customer, Campaign campaign) {
		float paid = salable.getPrice() - (salable.getPrice() * campaign.getDiscount() / 100);
		float saved = salable.getPrice() - paid;
		System.out.println(salable.getName() + " has been sold to " + customer.getFullName() + " for " + paid + " units and a discount of " + saved + " units with the '" + campaign.getName() + "' campaign");
	}

}

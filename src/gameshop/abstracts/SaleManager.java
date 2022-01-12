package gameshop.abstracts;

public abstract class SaleManager {

	public void sale(Salable salable, Customer customer) {
		System.out.println(salable.getName() + " is sold for " + salable.getPrice() + " price to " + customer.getFullName());
	}

	public abstract void sale(Salable salable, Customer customer, Campaign campaign);

}

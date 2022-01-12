package coffeeshop.mernis;

import coffeeshop.adapters.Citizen;
import coffeeshop.adapters.CitizenValidationService;

public class FakeValidationService implements CitizenValidationService {

	@Override
	public boolean validate(Citizen citizen) {
		return true;
	}

}

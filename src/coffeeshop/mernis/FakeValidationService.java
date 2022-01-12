package coffeeshop.mernis;

import commons.Citizen;
import commons.CitizenValidationService;

public class FakeValidationService implements CitizenValidationService {

	@Override
	public boolean validate(Citizen citizen) {
		return true;
	}

}

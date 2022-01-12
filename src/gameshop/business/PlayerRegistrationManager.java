package gameshop.business;

import java.util.Objects;

import commons.CitizenValidationService;
import gameshop.abstracts.RegistrationManager;
import gameshop.models.Player;

public class PlayerRegistrationManager extends RegistrationManager {

	private final CitizenValidationService citizenValidationService;
	private static PlayerRegistrationManager instance;

	private PlayerRegistrationManager(CitizenValidationService citizenValidationService) {
		this.citizenValidationService = citizenValidationService;
	}

	public static PlayerRegistrationManager getInstance(CitizenValidationService citizenValidationService) {
		if (Objects.isNull(instance)) {
			instance = new PlayerRegistrationManager(citizenValidationService);
		}
		return instance;
	}

	@Override
	public void register(Player player) {
		if (citizenValidationService.validate(player)) {
			System.out.println(player.getFirstName() + " registered successfully.");
		} else {
			System.out.println("Player is not a valid citizen!");
		}
	}

	@Override
	public void update(Player player) {
		if (citizenValidationService.validate(player)) {
			System.out.println(player.getFirstName() + " updated successfully.");
		} else {
			System.out.println("Transaction denied due to incorrect information!");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " deleted successfully.");
	}

}

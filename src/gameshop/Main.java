package gameshop;

import gameshop.abstracts.Campaign;
import gameshop.abstracts.RegistrationManager;
import gameshop.abstracts.SaleManager;
import gameshop.business.GameSaleManager;
import gameshop.business.PlayerRegistrationManager;
import gameshop.models.Game;
import gameshop.models.GameCampaign;
import gameshop.models.Player;
import services.MernisValidationService;

public class Main {

	public static void main(String[] args) {
		RegistrationManager registrationManager = PlayerRegistrationManager.getInstance(MernisValidationService.getInstance());
		SaleManager gameSaleManager = new GameSaleManager();

		Game pacman = new Game(1, "PacMan", 500F);
		Game mario = new Game(2, "Super Mario", 700F);

		Campaign purpleWednesday = new GameCampaign(1, "Mor Çarşamba kampanyası gel vatandaş", 15F);

		Player valid = Player.builder()
				.tckNo(10000000146L)
				.firstName("Mustafa Kemal")
				.familyName("Atatürk")
				.dateOfBirth("1881-05-19")
				.level(3)
				.build();

		registrationManager.register(valid);
		gameSaleManager.sale(mario, valid);
		gameSaleManager.sale(pacman, valid, purpleWednesday);
		registrationManager.update(valid);
		registrationManager.delete(valid);
	}

}

package gameshop.abstracts;

import gameshop.models.Player;

public abstract class RegistrationManager {

	public abstract void register(Player player);

	public abstract void update(Player player);

	public abstract void delete(Player player);

}

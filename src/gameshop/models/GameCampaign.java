package gameshop.models;

import gameshop.abstracts.Campaign;

public class GameCampaign implements Campaign {

	private int id;
	private String name;
	private float discount;

	public GameCampaign(int id, String name, float discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}

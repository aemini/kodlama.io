package gameshop.models;

import gameshop.abstracts.Customer;

public class Player extends People implements Customer {

	private int level;

	public Player(Builder builder) {
		super(builder.tckNo, builder.firstName, builder.familyName, builder.dateOfBirth);
		this.level = builder.level;
	}

	public static Builder builder() {
		return new Builder();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String getFullName() {
		return getFirstName() + " " + getFamilyName();
	}

	public static class Builder {

		private long tckNo;
		private String firstName;
		private String familyName;
		private String dateOfBirth;
		private int level;

		public Builder tckNo(long tckNo) {
			this.tckNo = tckNo;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder familyName(String familyName) {
			this.familyName = familyName;
			return this;
		}

		public Builder dateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Builder level(int level) {
			this.level = level;
			return this;
		}

		public Player build() {
			return new Player(this);
		}
	}

}

package coffeeshop.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import coffeeshop.adapters.Citizen;
import coffeeshop.adapters.Entity;

public class Customer implements Citizen, Entity {

	private long tckNo;
	private String firstName;
	private String familyName;
	private Date dateOfBirth;

	public Customer(long tckNo, String firstName, String familyName, String dateOfBirth) {
		this.tckNo = tckNo;
		this.firstName = firstName;
		this.familyName = familyName;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.dateOfBirth = formatter.parse(dateOfBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public long getTckNo() {
		return tckNo;
	}

	public void setTckNo(long tckNo) {
		this.tckNo = tckNo;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int getBirthYear() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfBirth);
		return calendar.get(Calendar.YEAR);
	}

}

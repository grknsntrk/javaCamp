package homework34G;

import java.time.LocalDate;

public class BasePlayer {
	
	int age;
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirthday;
	private String natioanlityId;
	
	public BasePlayer() {
		
	}
	
	public BasePlayer(String natioanlityId, String firstName, String lastName, LocalDate dateOfBirthday) {
		super();
		//this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthday = dateOfBirthday;
		this.natioanlityId = natioanlityId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirthday() {
		return dateOfBirthday;
	}
	public void setDateOfBirthday(LocalDate dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	public String getNatioanlityId() {
		return natioanlityId;
	}
	public void setNatioanlityId(String natioanlityId) {
		this.natioanlityId = natioanlityId;
	}
	
	
	
	
	

}

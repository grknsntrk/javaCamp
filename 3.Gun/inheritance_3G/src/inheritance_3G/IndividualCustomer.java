package inheritance_3G;

//base - super


public class IndividualCustomer extends Customer {
	
	private String firstName;
	private String lastName;
	private String nationalIdenty;
	
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
	public String getNationalIdenty() {
		return nationalIdenty;
	}
	public void setNationalIdenty(String nationalIdenty) {
		this.nationalIdenty = nationalIdenty;
	}

}

package inheritance_3G;

public class CorporateCustomer extends Customer { 
	
	private String companyName;
	private String taxNumber;
	
	public String getcompanyName() {
		return this.companyName;
	}
	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String gettaxNumber() {
		return this.taxNumber;
	}
	public void settaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	

}

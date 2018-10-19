package nasljedjivanje;

public class Admin extends User {
	private String adminPolje;

	public Admin() {

	}

	public Admin(String adminPolje) {
		this.adminPolje = adminPolje;
	}

	public String getAdminPolje() {
		return adminPolje;
	}

	public void setAdminPolje(String adminPolje) {
		this.adminPolje = adminPolje;
	}

	public void adminMetoda() {
		System.out.println("Ja sam admin.");
	}

}

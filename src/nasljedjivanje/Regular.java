package nasljedjivanje;

public class Regular extends User {
	private String regularPolje;

	public Regular() {

	}

	public Regular(String regularPolje) {
		this.regularPolje = regularPolje;
	}

	public String getRegularPolje() {
		return regularPolje;
	}

	public void setRegularPolje(String regularPolje) {
		this.regularPolje = regularPolje;
	}

	public void regularMetoda() {
		System.out.println("Ja sam regularna metoda.");
	}

}

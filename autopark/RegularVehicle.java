package project;

public class RegularVehicle implements Vehicle  {
	private String plate;
	public RegularVehicle(String plate) {
		this.plate=plate;
		isSpecial();
	}

	public String getPlate() {return plate;}
	public Subscription getSubscription() {return null;}
	public boolean isSpecial() {return false;}
	public void setPlate(String plate) {this.plate = plate;}
}

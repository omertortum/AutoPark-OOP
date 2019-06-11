package project;

public class OfficialVehicle implements Vehicle  {
	private String plate;
	
	public OfficialVehicle(String plate) {
		this.plate=plate;
		isSpecial();
	}

	public String getPlate() {return plate;}
	public Subscription getSubscription() {return null;}
	public boolean isSpecial() {return true;}
	public void setPlate(String plate) {this.plate = plate;}
}

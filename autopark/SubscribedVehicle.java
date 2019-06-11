package project;

public class SubscribedVehicle implements Vehicle {
	private String plate;
	public Subscription subscription;

	public SubscribedVehicle(Subscription subscription) {
		this.subscription=subscription;
		this.plate=subscription.getVehicle().plate;
	}
	
	public SubscribedVehicle(String plate) {this.plate=plate;}
	public String getPlate() {return plate;}
	public Subscription getSubscription() {return subscription;}
	public void setSubscription(Subscription subscription) {this.subscription = subscription;}
	public boolean isSpecial() {return false;}
	public void setPlate(String plate) {this.plate = plate;}
}

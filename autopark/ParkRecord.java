package project;

public class ParkRecord {
	private Time enterTime;
	private Time exitTime;
	private Vehicle vehicle;
	
	public void setEnterTime(Time enterTime) {this.enterTime = enterTime;}
	public ParkRecord(Time enterTime,Vehicle vehicle) {
		this.enterTime=enterTime;
		this.setVehicle(vehicle);
	}
	public int getParkingDuration() {return enterTime.getDifference(exitTime);}
	public Vehicle getVehicle() {return vehicle;}
	public Time getEnterTime() {return enterTime;}
	private void setVehicle(Vehicle vehicle) {this.vehicle = vehicle;}
	public Time getExitTime() {return exitTime;}
	public void setExitTime(Time exitTime) {this.exitTime = exitTime;}	
}

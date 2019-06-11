package project;

public class Subscription {
	private Date begin,end;
	public SubscribedVehicle vehicle;
	
	public Subscription(Date begin,Date end,String plate) {
		this.setBegin(begin);
		this.setEnd(end);
		vehicle=new SubscribedVehicle(plate);
	}
	
	public boolean isValid() {
		Date today=new Date().getToday();
		if((today.isBeforeThan(end)|| today.isEqualsWith(end)) && ((today.isAfterThan(begin)||today.isEqualsWith(begin)))) {
		return true;
		}
		return false;
	}
	
	public void setVehicle(SubscribedVehicle vehicle) {this.vehicle = vehicle;}
	public Date getEnd() {return end;}
	public SubscribedVehicle getVehicle() {return vehicle;}
	public void setEnd(Date end) {this.end = end;}
	public Date getBegin() {return begin;}
	public void setBegin(Date begin) {this.begin = begin;}

}

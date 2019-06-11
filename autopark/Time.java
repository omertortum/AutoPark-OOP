package project;

public class Time {
	
	private int hour,minute;
	
	public Time(int hour,int minute) {
		this.hour=hour;
		this.minute=minute;
	}

	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public void setHour(int hour) {	this.hour = hour;}
	public void setMinute(int minute) {this.minute = minute;}

	public int getDifference(Time other) {
		int diff=0,h,m;
		h=other.getHour();
		m=other.getMinute();
		diff=(hour-h)*60;
		diff+=m-minute;		//Otoparkta geçen net zamanı dönderiyor.
		return diff/60;
	}
}

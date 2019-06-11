package project;

public class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date() {}
	public int getDay() {return day;}
	public void setDay(int day) {this.day = day;}
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	public boolean isBeforeThan(Date other){
		if(other.year>year) {
			return true; }
		else if(other.year==year && other.month>month) {
			return true; }
		else if(other.year==year && other.month==month && other.day>day) {
		
					return true;
				}
		else {
		return false;
	}}
	public boolean isAfterThan(Date other){
		if(other.year< year ) {return true;}
		else if((other.year==year && other.month<month)) {return true;}
		else if(other.year==year && other.month==month && other.day<day) {return true;}
		else {return false;}}
	
	public boolean isEqualsWith(Date other){
		if(other.year==year && other.month==month && other.day==day ) {
			return true;}		
		return false;}
	
	public Date getToday() {
		java.util.Date today=new java.util.Date();
		Date ntoday=new Date(today.getDate(),(today.getMonth()+1),(today.getYear()+1900));
		return ntoday;}
	
}

package project;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;

public class AutoPark {
	public ArrayList<SubscribedVehicle> subscribedVehicles;
	public ArrayList<ParkRecord> parkRecords;
	private double hourlyFee,incomeDaily;
	private int capacity;

	public int getCapacity() {return capacity;}
	public void setCapacity(int capacity) {
		if(capacity>this.capacity) {
		this.capacity = capacity;
		System.out.println("Yeni kapasite: "+capacity);
	}
		else System.out.println("Eski kapasite daha büyük");
	}	
		
	public AutoPark(double hourlyFee,int capacity) {
		subscribedVehicles=new ArrayList<SubscribedVehicle>();
		parkRecords=new ArrayList<ParkRecord>(capacity);
		this.hourlyFee=hourlyFee;
		this.capacity=capacity;
		incomeDaily=0;
	}
	
	public SubscribedVehicle searchVehicle(String plate) {		
		for(SubscribedVehicle s:subscribedVehicles) {
			if(s.getPlate().equals(plate)) {
				return s;
			}
		}
		return null;
	}
	
	public boolean isParked(String plate) {
		int i;
		if(parkRecords.size()==0) {return false;}
		for(i=0; i<parkRecords.size();i++) {
			if(parkRecords.get(i).getVehicle().getPlate().equals(plate)){
				return true;
			}
		}
		return false;		 
		}		

	public boolean addVehicle(SubscribedVehicle vehicle) {//Araça üye listesinde yoksa ekler.
		if(searchVehicle(vehicle.getPlate())==null) {
			subscribedVehicles.add(vehicle);
			return true;
		}		
		else
		return false;		
	}
	
	public void printVehicle() {		
		for(int i=0;i<subscribedVehicles.size();i++) {
		if(searchVehicle(subscribedVehicles.get(i).getPlate())!=null) {
			System.out.println(subscribedVehicles.get(i).getPlate());
		}
	}}
	
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial) {
		
		if(isParked(plate)) {			
			return false;
		}
		else if(searchVehicle(plate)!=null) {
			ParkRecord record=new ParkRecord(enter,searchVehicle(plate));	
			parkRecords.add(record);
			return true;
		}
		else if(isOfficial) {
			OfficialVehicle ovehicle=new OfficialVehicle(plate);
			ParkRecord record=new ParkRecord(enter,ovehicle);
			parkRecords.add(record);
			return true;
		}
		else {
			RegularVehicle rvehicle=new RegularVehicle(plate);
			ParkRecord record=new ParkRecord(enter,rvehicle);
			parkRecords.add(record);
			return true;
		}
	}
	
	public boolean vehicleExits(String plate,Time exit) {
		
	if(isParked(plate)) {
		for(int i=0;i<parkRecords.size();i++) {	
			if(parkRecords.get(i).getVehicle().getPlate()==plate) {
				if(parkRecords.get(i).getVehicle().isSpecial()) {
					parkRecords.remove(i);
					return true;
				}
				else if(searchVehicle(plate)!=null) {
					if(parkRecords.get(i).getVehicle().getSubscription().isValid()) {		//Bugünün tarihi üyelik bitiþ tarihinden öncemi.
						System.out.println("Uyeliginiz devam ediyor");
						parkRecords.remove(i);
						return true;
					}							
				else {		
				System.out.println(parkRecords.get(i).getEnterTime());
				parkRecords.get(i).setExitTime(exit);				
				incomeDaily+=parkRecords.get(i).getParkingDuration()*hourlyFee;
				System.out.println("\n"+plate+", Uyeliði bitmiþ araç çýkýþ yaptý.Kapasite: "+(1+capacity-parkRecords.size()));
				System.out.println("Gecen Sure: "+parkRecords.get(i).getParkingDuration()+" saat, Ödenen ücret: "+parkRecords.get(i).getParkingDuration()*hourlyFee);
				System.out.println();
				parkRecords.remove(i);
				return true;	
				}
				}								
				}
				else {
				parkRecords.get(i).setExitTime(exit);
				incomeDaily+=parkRecords.get(i).getParkingDuration()*hourlyFee;
				System.out.println("\n"+plate+", Normal araç çýkýþ yaptý. Kapasite: "+(1+capacity-parkRecords.size()));
				System.out.println("Gecen Sure: "+parkRecords.get(i).getParkingDuration()+" saat, Ödenen ücret: "+parkRecords.get(i).getParkingDuration()*hourlyFee);
				parkRecords.remove(i);
				return true;
			}}
				return true;
		}
		System.out.println("\n"+plate+", Bu arac park edili degil");
		return false;
	}
	
	public void enlargeVehicleArray(int capacity) {
		if(capacity>this.capacity) {
		this.capacity=capacity; //Kapasite arttýrýldý
		}
		else if(capacity==this.capacity) {
			System.out.println("Kapasite ayný");
		}
		else
			System.out.println("Kapasiteyi düþüremezsin");
	}
	
	public void printParked() {
		int i;
		if(parkRecords.size()==0) {
			return ;
		}
		for(i=0; i<parkRecords.size();i++) {
		System.out.println("Park Edilen "+i+".nci Araba:"+parkRecords.get(i).getVehicle().getPlate());{
			}
		}
		return ;		 
		}
	
	public double getHourlyFee() {return hourlyFee;}
	public void setHourlyFee(double hourlyFee) {this.hourlyFee = hourlyFee;}
	public double getIncomeDaily() {return incomeDaily;}
	public void setIncomeDaily(double incomeDaily) {this.incomeDaily = incomeDaily;}
	public int getSizeofPark() {return	parkRecords.size();}
	public int getSizeofSubscribed() {return subscribedVehicles.size();}
	public String toString() {
		return "AutoPark [subscribedVehicles=" + subscribedVehicles + ", parkRecords=" + parkRecords + ", hourlyFee="
				+ hourlyFee + ", incomeDaily=" + incomeDaily + ", capacity=" + capacity + "]";
	}
}
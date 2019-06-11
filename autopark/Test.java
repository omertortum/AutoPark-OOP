package project;



public class Test { //Rasgele denemeler.

	public static void main(String[] args) {
		
		AutoPark park=new AutoPark(5.5,50);
		RegularVehicle r1=new RegularVehicle("ra1");
		RegularVehicle r2=new RegularVehicle("ra2");
		RegularVehicle r3=new RegularVehicle("ra");
		
		
		
		OfficialVehicle o1= new OfficialVehicle("of1");
		OfficialVehicle o2= new OfficialVehicle("of2");
		Date dt1 = new Date(31,4,2019);
		Date dt2 = new Date(31,6,2019);
		SubscribedVehicle s1=new SubscribedVehicle(new Subscription(dt1,dt2,"sa1"));
		SubscribedVehicle s2=new SubscribedVehicle("sa2");
		SubscribedVehicle s3=new SubscribedVehicle("sa3");
		SubscribedVehicle s4=new SubscribedVehicle("sa4");
		park.addVehicle(s1);
		park.addVehicle(s2);
		park.addVehicle(s3);
		park.addVehicle(s4);
		

		
		Time h=new Time(16,5);
		park.vehicleEnters(s1.getPlate(),h,false);
		park.vehicleEnters(s2.getPlate(),h,false);
		park.vehicleEnters(s3.getPlate(),h,false);
		//park.vehicleEnters(s4.getPlate(),h,false);
		park.vehicleEnters(r1.getPlate(),h,false);
		park.vehicleEnters(r2.getPlate(),h,false);
		park.vehicleEnters(r3.getPlate(),h,false);
		park.vehicleEnters(o1.getPlate(),h,true);
		park.vehicleEnters(o2.getPlate(),h,true);
		
		
		park.isParked("sa2");
		park.isParked(s4.getPlate());
		park.isParked(s2.getPlate());
		
		park.vehicleExits(s1.getPlate(),h);
		park.vehicleExits(o1.getPlate(),h);
		park.vehicleExits(r1.getPlate(),h);
		park.printParked();
	//	System.out.println(park.toString()); 
	
		
		
		
	}

}

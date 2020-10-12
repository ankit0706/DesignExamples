package com.sample.factorymethod;

public class AviationClient {

	public static void main(String[] args){
		Helicopter surveyor = Helicopter.getSmallOpenDoorChopper();
		Helicopter airbus = Helicopter.getBigClosedDoorChopper();
		
		System.out.println("Surveyor");
		System.out.println(surveyor.getSittingCapacity());
		System.out.println(surveyor.closeDoors());
		System.out.println(surveyor.openDoors());
		surveyor.start();
			
		System.out.println("Airbus");
		System.out.println(airbus.getSittingCapacity());
		System.out.println(airbus.closeDoors());
		System.out.println(airbus.openDoors());
		System.out.println(airbus.openDoors());
		System.out.println(airbus.closeDoors());
		airbus.start();
		
		surveyor.stop();
		airbus.stop();
		
		Helicopter medFlier;
		try {
			medFlier = Helicopter.get4FlierChopper();
		}catch(IstanceLimitException e) {
			e.printStackTrace();
			surveyor.killEngine();
			surveyor = null;
		}
		medFlier = Helicopter.get4FlierChopper();
		medFlier.start();
	}

}

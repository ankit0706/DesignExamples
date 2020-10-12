package com.sample.factorymethod;
/**
 * Demonstration of the use of static factory method
 * for object instantiation
 * @author AANU
 *
 */
public class Helicopter {
	private int size;
	private boolean hasDoors;
	private boolean isDoorOpen = false;
	private static int num_of_instances = 0; 
	
	/*
	 * constructor is private so the class can only be 
	 * instantiated from within. 
	 */
	private Helicopter(int heliSize, boolean doors) {
		this.size = heliSize;
		this.hasDoors = doors;
		num_of_instances++;
	}
	
	/*
	 * Factory methods not only hide implementation details
	 * but are also more expressive and readable.
	 */
	public static Helicopter getSmallOpenDoorChopper() {
		if(num_of_instances < HeliConstants.MAX_INSTANCES) {
			Helicopter helicopter = new Helicopter(HeliConstants.SIZE_S, false);
			return helicopter;
		}else {
			throw new IstanceLimitException("No Instances available");
		}
	}
	
	public static Helicopter getBigClosedDoorChopper() {
		//we can also control the number of instances, this way
		if(num_of_instances < HeliConstants.MAX_INSTANCES) {
			Helicopter helicopter = new Helicopter(HeliConstants.SIZE_L, true);
			return helicopter;
		}else {
			throw new IstanceLimitException("No Instances available");
		}
	}
	
	public static Helicopter get4FlierChopper() {
		if(num_of_instances < HeliConstants.MAX_INSTANCES) {
			Helicopter helicopter = new Helicopter(HeliConstants.SIZE_M, true);
			return helicopter;
		}else {
			throw new IstanceLimitException("No Instances available");
		}
	}
	
	public String openDoors() {
		if(this.hasDoors) {
			if(isDoorOpen) {
				return "Doors already open";
			}else {
				isDoorOpen = true;
				return "Doors have been opened";
			}
		}else {
			return "This is an open door helicopter";
		}
	}
	
	public String closeDoors() {
		if(this.hasDoors) {
			if(isDoorOpen) {
				isDoorOpen = false;
				return "Doors have been closed";
			}else {
				return "Doors are already closed";
			}
		}else {
			return "This is an open door helicopter";
		}
	}
	
	public int getSittingCapacity() {
		if(size == HeliConstants.SIZE_S) {
			return 2;
		}else if(size == HeliConstants.SIZE_M) {
			return 4;
		}else {
			return 6;
		}
	}
	
	public void start() {
		System.out.println("Flying.................");
	}
	
	public void stop() {
		System.out.println("Landing.................");
	}
	
	public void killEngine() {
		System.out.println("Helicopter stopped");
		num_of_instances--;
	}
}

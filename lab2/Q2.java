package edu.scu.coen160.lab2;

class Asset{ // extend something?
	// ToDo: Implement powerDown
	public void PowerDown() {
		System.out.println("Asset Powered Down");
	}
}

class EmergencyLight extends Asset { // what to extend?
	// ToDo: Implement powerDown
	@Override
	public void PowerDown() {
		System.out.println("Emergency Light Powered Down");
	}
}

class PersonalComputer extends Asset { // what to extend?
	// ToDo: Implement powerDown
	@Override
	public void PowerDown() {
		System.out.println("Personal Computer Powered Down");
	}
}

class TV extends Asset { // what to extend?
	//ToDo: Implement powerDown
	@Override
	public void PowerDown() {
		System.out.println("TV Powered Down");
	}
	
	
}

class BuildingManager {
	Asset things[] = new Asset[24];
	int numItems = 0;

	public void powerDownAtNight() {
		for (int i = 0; i < things.length; i++)
			if (this.things[i] != null)
				this.things[i].PowerDown();
	}

	// Add an Asset to this building
	public void add(Asset thing) {
		this.things[this.numItems] = thing;
		this.numItems=this.numItems+1;
	}
}

public class Q2 {
	public static void q2() {
		BuildingManager b1 = new BuildingManager();

		b1.add(new EmergencyLight());
		b1.add(new PersonalComputer());
		b1.add(new TV());
		b1.powerDownAtNight();
	}
}
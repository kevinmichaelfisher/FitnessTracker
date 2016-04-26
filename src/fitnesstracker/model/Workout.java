package fitnesstracker.model;

public class Workout {
	
	//the names of each lift, should correspond to the order of the lifts
	//so if squats are done first, they are mainLift1, if they are second, mainLift2, etc.
	String mainLift1Name;
	String mainLift2Name;
	String mainLift3Name;
	String mainLift4Name;
	String accessoryLift1Name;
	String accessoryLift2Name;
	
	//weight lifted for each lift in pounds
	int mainLift1Weight;
	int mainLift2Weight;
	int mainLift3Weight;
	int mainLift4Weight;
	int accessoryLift1Weight;
	int accessoryLift2Weight;

	
	int mainLift1RepsPerSet[] = new int[6]; //6 sets
	int mainLift2RepsPerSet[] = new int[4]; //4 sets
	int mainLift3RepsPerSet[] = new int[4]; //4 sets
	int mainLift4RepsPerSet[] = new int[4]; //4 sets
	int accessoryLift1RepsPerSet[] = new int[2]; //2 sets
	int accessoryLift2RepsPerSet[] = new int[2]; //2 sets


	public Workout(String mainLift1Name, String mainLift2Name, String mainLift3Name, String mainLift4Name,
					String accessoryLift1Name, String accessoryLift2Name,
					int mainLift1Weight, int mainLift2Weight, int mainLift3Weight, int mainLift4Weight,
					int accessoryLift1Weight, int accessoryLift2Weight,
					int mainLift1RepsPerSet[], int mainLift2RepsPerSet[], int mainLift3RepsPerSet[], int mainLift4RepsPerSet[],
					int accessoryLift1RepsPerSet[], int accessoryLift2RepsPerSet[]) {
		this.mainLift1Name = mainLift1Name;
		this.mainLift2Name = mainLift2Name;
		this.mainLift3Name = mainLift3Name;
		this.mainLift4Name = mainLift4Name;
		this.accessoryLift1Name = accessoryLift1Name;
		this.accessoryLift2Name = accessoryLift2Name;
		
		this.mainLift1Weight = mainLift1Weight;
		this.mainLift2Weight = mainLift2Weight;
		this.mainLift3Weight = mainLift3Weight;
		this.mainLift4Weight = mainLift4Weight;
		this.accessoryLift1Weight = accessoryLift1Weight;
		this.accessoryLift2Weight = accessoryLift2Weight;
		
		this.mainLift1RepsPerSet = mainLift1RepsPerSet;
		this.mainLift2RepsPerSet = mainLift2RepsPerSet;
		this.mainLift3RepsPerSet = mainLift3RepsPerSet;
		this.mainLift4RepsPerSet = mainLift4RepsPerSet;
		this.accessoryLift1RepsPerSet = accessoryLift1RepsPerSet;
		this.accessoryLift2RepsPerSet = accessoryLift2RepsPerSet;
	}

	public String getMainLift1Name() {
		return mainLift1Name;
	}
	
	public void setMainLift1Name(String mainLift1Name) {
		this.mainLift1Name = mainLift1Name;
	}
	
	public String getMainLift2Name() {
		return mainLift2Name;
	}
	
	public void setMainLift2Name(String mainLift2Name) {
		this.mainLift2Name = mainLift2Name;
	}
	
	public String getMainLift3Name() {
		return mainLift3Name;
	}
	
	public void setMainLift3Name(String mainLift3Name) {
		this.mainLift3Name = mainLift3Name;
	}
	
	public String getMainLift4Name() {
		return mainLift4Name;
	}
	
	public void setMainLift4Name(String mainLift4Name) {
		this.mainLift4Name = mainLift4Name;
	}
	
	public String getAccessoryLift1Name() {
		return accessoryLift1Name;
	}
	
	public void setAccessoryLift1Name(String accessoryLift1Name) {
		this.accessoryLift1Name = accessoryLift1Name;
	}
	
	public String getAccessoryLift2Name() {
		return accessoryLift2Name;
	}
	
	public void setAccessoryLift2Name(String accessoryLift2Name) {
		this.accessoryLift2Name = accessoryLift2Name;
	}
	
	public int getMainLift1Weight() {
		return mainLift1Weight;
	}
	
	public void setMainLift1Weight(int mainLift1Weight) {
		this.mainLift1Weight = mainLift1Weight;
	}
	
	public int getMainLift2Weight() {
		return mainLift2Weight;
	}
	
	public void setMainLift2Weight(int mainLift2Weight) {
		this.mainLift2Weight = mainLift2Weight;
	}
	
	public int getMainLift3Weight() {
		return mainLift3Weight;
	}
	
	public void setMainLift3Weight(int mainLift3Weight) {
		this.mainLift3Weight = mainLift3Weight;
	}

	public int getMainLift4Weight() {
		return mainLift4Weight;
	}
	
	public void setMainLift4Weight(int mainLift4Weight) {
		this.mainLift4Weight = mainLift4Weight;
	}

	public int getAccessoryLift1Weight() {
		return accessoryLift1Weight;
	}
	
	public void setAccessoryLift1Weight(int accessoryLift1Weight) {
		this.accessoryLift1Weight = accessoryLift1Weight;
	}

	public int getAccessoryLift2Weight() {
		return accessoryLift2Weight;
	}
	
	public void setAccessoryLift2Weight(int accessoryLift2Weight) {
		this.accessoryLift2Weight = accessoryLift2Weight;
	}
	
	public int[] getMainLift1RepsPerSet() {
		return mainLift1RepsPerSet;
	}
	
	public void setMainLift1RepsPerSet(int[] mainLift1RepsPerSet) {
		this.mainLift1RepsPerSet = mainLift1RepsPerSet;
	}
	
	public int[] getMainLift2RepsPerSet() {
		return mainLift2RepsPerSet;
	}
	
	public void setMainLift2RepsPerSet(int[] mainLift2RepsPerSet) {
		this.mainLift2RepsPerSet = mainLift2RepsPerSet;
	}
	
	public int[] getMainLift3RepsPerSet() {
		return mainLift3RepsPerSet;
	}
	
	public void setMainLift3RepsPerSet(int[] mainLift3RepsPerSet) {
		this.mainLift3RepsPerSet = mainLift3RepsPerSet;
	}
	
	public int[] getMainLift4RepsPerSet() {
		return mainLift4RepsPerSet;
	}
	
	public void setMainLift4RepsPerSet(int[] mainLift4RepsPerSet) {
		this.mainLift4RepsPerSet = mainLift4RepsPerSet;
	}
	
	public int[] getAccessoryLift1RepsPerSet() {
		return accessoryLift1RepsPerSet;
	}
	
	public void setAccessoryLift1RepsPerSet(int[] accessoryLift1RepsPerSet) {
		this.accessoryLift1RepsPerSet = accessoryLift1RepsPerSet;
	}
	
	public int[] getAccessoryLift2RepsPerSet() {
		return accessoryLift2RepsPerSet;
	}
	
	public void setAccessoryLift2RepsPerSet(int[] accessoryLift2RepsPerSet) {
		this.accessoryLift2RepsPerSet = accessoryLift2RepsPerSet;
	}
}

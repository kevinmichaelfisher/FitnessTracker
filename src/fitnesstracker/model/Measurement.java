package fitnesstracker.model;

public class Measurement {
	
	String bodyPart; //which body part is being measured
	int measurement; //in inches
	
	public Measurement(String bodyPart, int measurement) {
		this.bodyPart = bodyPart;
		this.measurement = measurement;
	}

}

/*
C Odoemene
Measure.java
03 09 2020
*/

public class Measure {

	private double cm ;
	private double m;
	private double inch;

	public Measure() {

	cm = 0.0;
	m = 0.0;
	inch = 0.0;

	}

	public void setM(double m){
		this.m = m;
	}

	public void compute(){
		cm = m * 100;
		inch = m * 39.37;
	}

	public double getCm() {
		return cm;
	}

	public double getInch(){
		return inch;
	}
}
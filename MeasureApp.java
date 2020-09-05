/*
C Odoemene
MeasureApp.java
03 09 2020
*/

import java.util.*;
public class MeasureApp {
	public static void main (String [] args){

		double cm;
		double m ;
		double inch;

		Scanner keyboard;
		keyboard = new Scanner(System.in);

		Measure myMeasure;
		myMeasure = new Measure();

		System.out.println("Please enter the number of metres");
		m = keyboard.nextDouble();
		myMeasure.setM(m);

		myMeasure.compute();

		cm = myMeasure.getCm();
		inch = myMeasure.getInch();

		System.out.println("Inches : "+inch);
		System.out.println("Centimeters : "+cm);
	}
}
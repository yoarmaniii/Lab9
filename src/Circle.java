
public class Circle {
	
	//Declare your instance variables
	public double radius;
	public double area;
	public double circumference;
	
	// Declare your constructor
	public Circle (double rad){
		radius = rad;
	}
	//Acquire your methods for the area
	public double getArea(){
		double area = Math.PI * (radius * radius);
		return area;
	}//Acquire method for the formatted area
	public String getFormattedArea(){
		String myArea = formatNumber(getArea());
		return myArea;
	}//Acquire method for the formatted number
	private String formatNumber(double x){
		String formattedNumber = String.format("%,.2f", x);
		return formattedNumber;

	}
	public double getCircumference(){
		double circumfernce = 2* Math.PI*(radius);
		return circumference;
	}
	public String getFormattedCircumference(){
		String myCirc = formatNumber(getCircumference());
		return myCirc;
	}
}	//End of Circle class


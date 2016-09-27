import java.util.Scanner;
public class CircleApp {

	public static void main(String[] args) {
		System.out.println(" Welcome to the Circle Tester!");
		System.out.println(" Enter the radius: ");
		Scanner input = new Scanner(System.in);
		double userRadius = input.nextDouble();
		
		
		
		//Userinput for the radius
		Circle myCircle = new Circle(userRadius);
		System.out.println("The circumference is : " + myCircle.getFormattedCircumference());
		System.out.println("The area is : " + myCircle.getFormattedArea());
		
		
	}

}

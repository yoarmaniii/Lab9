import java.util.Scanner;
public class CircleApp {

	//declare variables
	public static void main(String[] args) {
		boolean cont = true;
		String userCont= "y";
		System.out.println(" Welcome to the Circle Tester!");

		while (cont){
		System.out.println(" Enter the radius: ");
		Scanner input = new Scanner(System.in);
		double userRadius = input.nextDouble(); //Get userinput value for radius
		input.nextLine();
		//show output of the circumference and area
		Circle myCircle = new Circle(userRadius);
		Circle.getObjectCount();
		System.out.println("The circumference is : " + myCircle.getFormattedCircumference());
		System.out.println("The area is : " + myCircle.getFormattedArea());
		
		//make while loop to either continue again or quit
		System.out.println("Would you like to continue? yes/No");
		String userinput = input.nextLine();
		
		if (userinput.equals("yes")){
			cont = true;
		}
		
		else{userinput.equals("no");
			cont = false;
		}
		
		}//End of while loop
		System.out.println("Goodbye!");
		System.out.println(Circle.getObjectCount());

	}// End of main method

}//End of class

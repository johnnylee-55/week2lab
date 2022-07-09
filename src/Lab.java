import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		// create a variable named age and assign it a value of 14
		int age = 14;
		
		// print the boolean expression age >= 16 to the console and note the result
		System.out.println(age >= 16);
		// change the value of age to 18 and run again
		age = 18;
		System.out.println(age >= 16);
		
		// using a conditional, print "You can drive" if your age is greater than or equal to 16
		// and "You cannot drive" otherwise
		// change the value of age and rerun to see the result
		
//		if (age >= 16) {
//			System.out.println("You can drive");
//		} else {
//			System.out.println("You cannot drive");
//		}
		
		// add a new variable called hasLicense before the conditional
		// change the boolean expression in the conditional to additionally include hasLicense = true
		// try changing the values of age and hasLicense and note the different results
		
		boolean hasLicense = !true;
		
		if (hasLicense == true && age >= 16) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		// create two new variables - costOfMilk and thirstLevel
		// create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		// or if thirstLevel is greater 6 and prints "No Thanks" otherwise
		// change the values and note the different results
		
		double costOfMilk, thirstLevel;
		costOfMilk = thirstLevel = 2;
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		// create two variables called numberOfCookies and numberOfChildren
		// you will evenly distribute all of the cookies to the children, and
		// as an adult, keep the rest of the cookies for yourself
		// use a conditional to print the following depending on the following conditions:
		// if there are 0 cookies remaining, print "Sad Face"
		// if there are less than 2 cookies, print "Yes!"
		// if there are less than 5 cookies, print "Woohooo!"
		// if there are 5 or more cookies, print "Jackpot!"
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("How many cookies do you have? ");
		int numberOfCookies = kb.nextInt();
		
		System.out.print("How many children are there? ");
		int numberOfChildren = kb.nextInt();
		
		if (numberOfCookies > 0 && numberOfChildren > 0) {
			
			System.out.println("You can give " + (numberOfCookies / numberOfChildren) + " cookie(s) to each child.");
			System.out.println("You get to keep " + (numberOfCookies % numberOfChildren) + " for yourself.");
			
			if (numberOfCookies % numberOfChildren == 0) {
				System.out.println("Sad Face.");
			} else if (numberOfCookies % numberOfChildren < 2) {
				System.out.println("Yes!");
			} else if (numberOfCookies % numberOfChildren < 5) {
				System.out.println("Woohooo!");
			} else {
				System.out.println("Jackpot!");
			}
		} else if (numberOfCookies <= 0) {
			System.out.println("There are no cookies to give out...");
		} else if (numberOfChildren <= 0) {
			System.out.println("All " + numberOfCookies + " cookies are for you... >:)");
		}
	}

}

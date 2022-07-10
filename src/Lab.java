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
		
		/*
		 * if (age >= 16) { 
		 * 	System.out.println("You can drive");
		 * } else {
		 * 	System.out.println("You cannot drive"); 
		 * }
		 */
		
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
		} else {
			System.out.println("Please enter valid numbers");
		}
		
		// Part 2
		
		// create a variable called loyaltyMemberStatus and assign the value to "SILVER"
		String loyaltyMemberStatus = "SILVER";
		System.out.print("what is your membership status ");
		loyaltyMemberStatus = kb.next();
		
		// create a variable called loyaltyMemberDiscount and assign the value to 0.0
		double loyaltyMemberDiscount = 0.0;
		
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		// "SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		switch (loyaltyMemberStatus) {
			case "SILVER" :
				loyaltyMemberDiscount = 0.10;
				System.out.println("Member Status: SILVER - 10% discount");
				break;
			case "GOLD" :
				loyaltyMemberDiscount = 0.15;
				System.out.println("Member Status: GOLD - 15% discount");
				break;
			case "PLATINUM" :
				loyaltyMemberDiscount = 0.25;
				System.out.println("Member Status: PLATINUM - 25% discount");
				break;
		}
		
		// create a variable called billTotal and assign a value
		double billTotal = 200.67;
		System.out.print("What is your bill total? ");
		billTotal = kb.nextDouble();
		
		// create a variable called adjustedBillTotal and assign it the billTotal minus the loyaltyMemberDiscount % of billTotal
		double adjustedBillTotal = billTotal - (billTotal * loyaltyMemberDiscount);
		System.out.println("Your discounted total is: $" + adjustedBillTotal);
		
		// if the adjustedBillTotal is greater than 500, upgrade loyaltyMemberStatus from silv > gold or gold > plat
		if (adjustedBillTotal > 500) {
			if (loyaltyMemberStatus.equalsIgnoreCase("silver")) {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus.equalsIgnoreCase("gold")) {
				loyaltyMemberStatus = "PLATNUM";
			}
			System.out.println("Congratulations! Your membership has been upgraded to " + loyaltyMemberStatus + ".");
		}
		
		// create two variables, username and password	
		String username = "Username";
		String password = "Password";
		
		System.out.print("Please enter your username:");
		String attemptedUsername = kb.next();
		System.out.print("Please enter your password:");
		String attemptedPassword = kb.next();
		
		// create a conditional that prints "login successful" if the username is "Username" and password is "Password"
		if (attemptedUsername.equals(username) && attemptedPassword.equals(password)) {
			System.out.println("login successful");
		} else {
		// otherwise, print "access denied"
			System.out.println("access denied");
		}
		
		// write a for loop that prints each number from 0 to 9
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// write a for loop that prints each number from 10 to 0 backwards
		
		for (int j = 10; j >= 0; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		// write a for loop that prints every other number from 0 to 100
		
		for (int k = 0; k <= 100; k += 2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if odd
		
		for (int counter = 0; counter <= 100; counter++) {
			if (counter % 2 == 0) {
				System.out.print("EVEN ");
			} else {
				System.out.print("ODD ");
			}
		}
		System.out.println();
		
		// write a while loop that starts at 100 and iterates backwards by 1 until 0
		// divide each number by 3 until and print the remainder to the console
		
		int i = 100;
		while (i >= 0) {
			System.out.println(i + " " + i % 3);
			i--;
		}
	}

}

package a1;

import java.util.Scanner;

public class A1Novice {
	public static void main(String[] args) {
		//Initializes the scanner 
		Scanner scan = new Scanner(System.in);
		//Takes in the number of customers and labels it as nCustomers
		int nCustomers = scan.nextInt();
		//Loops through each customer
		while(nCustomers-->0)
		{
			//Takes in the first name, last name, and the amount of items this specific customer bought
			String firstName = scan.next();
			String lastName = scan.next();
			int nItems = scan.nextInt();
			//Initializes a double variable to keep track on how much is being spent by this customer
			double totalPrice = 0;
			//Loops through each item for this specific customer
			while(nItems-->0)
			{
				//Takes in the quantitiy of this specific item, the name of this item, and the unit price of this item
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				//Calculates the total price for this specific item for this specific customer and adds it to the customer's totalPrice variable
				totalPrice += itemQuantity*itemPrice;
			}
			//Prints out the First character of the first name with a period, the last name, and the totalPrice for this specific customer
			System.out.printf("%s. %s: %.2f%n",firstName.charAt(0),lastName,totalPrice);
		}
	}
}

package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		//Initializes the scanner 
		Scanner scan = new Scanner(System.in);
		//Takes in the number of items and labels it as nItems
		int nItems = scan.nextInt();
		//Initializes a hashmap to associate a price to each item name
		HashMap<String,Double> map = new HashMap<String,Double>();
		//Loops through each item
		while(nItems-->0)
		{
			//Takes in the name and price of a specific item
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			//Puts it into the map
			map.put(itemName,itemPrice);
		}
		//Takes in the number of customers
		int nCustomers = scan.nextInt();
		//Initializes two variables to keep track of what was the biggest spent / smallest spent so far, 
		//as well as the corresponding names. 
		double biggestSpent = Double.MIN_VALUE;
		String biggestSpentName = "";
		double smallestSpent = Double.MAX_VALUE;
		String smallestSpentName = "";
		//Initializes a variable to add up all of what's spent
		double averageSpent = 0;
		//Loops through each customer
		for(int i = 0; i < nCustomers; i++)
		{
			//Takes in the first name, the last name, and the amount of items bought by this customer
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsBought = scan.nextInt();
			//Initializes a double variable to sum up the total amount spent by this customer
			double totalSpent = 0;
			//Loops through each item bought by this customer
			while(itemsBought-->0)
			{
				//Takes in the quantity for this specific item, as well as the name
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				//Calculates the total spent for this specific item by using the map to get the unit price of the item.
				totalSpent += itemQuantity * map.get(itemName);
			}
			//If this is the biggest spent so far
			if(totalSpent>biggestSpent)
			{
				//Set biggestspent to this customer's totalspent
				biggestSpent = totalSpent;
				//And set the corresponding biggestSpentName variable to this customer's name
				biggestSpentName = firstName + " " + lastName;
			}
			//If this is the smallest spent so far
			if(totalSpent<smallestSpent)
			{
				//Set smallestspent to this customer's smallestspent
				smallestSpent = totalSpent;
				//And set the corresponding smallestSpentName variable to this customer's name
				smallestSpentName = firstName + " " + lastName;
			}
			//Add this customer's totalspent to the averageSpent variable
			averageSpent += totalSpent;
		}
		//The averageSpent value wouldn't be an average without dividing by the total amount of customers
		averageSpent /= nCustomers;
		System.out.printf("Biggest: %s (%.2f)%n", biggestSpentName, biggestSpent);
		System.out.printf("Smallest: %s (%.2f)%n", smallestSpentName, smallestSpent);
		System.out.printf("Average: %.2f%n", averageSpent);
	}
}

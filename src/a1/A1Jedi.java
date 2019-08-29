package a1;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashSet;

public class A1Jedi {

	public static void main(String[] args) {
		//Initializes the scanner 
		Scanner scan = new Scanner(System.in);
		//Takes in the number of items and stores it into nItems
		int nItems = scan.nextInt();
		//Initializes customerCountMap to count how many unique customers each item was bought by.
		LinkedHashMap<String,Integer> customerCountMap = new LinkedHashMap<String,Integer>();
		//Initializes quanitityCountMap to count how many times each item was bought.
		LinkedHashMap<String,Integer> quantityCountMap = new LinkedHashMap<String,Integer>();
		//Loops through each items
		while(nItems-->0)
		{
			//Takes in the item's name and unit price
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			//Initially store each item in each map as zero (since no one has bought anything yet)
			customerCountMap.put(itemName, 0);
			quantityCountMap.put(itemName, 0);
		}
		//Takes in the number of customers
		int nCustomers = scan.nextInt();
		for(int i = 0; i < nCustomers; i++)
		{
			//Takes in their name and how many items they bought
			String firstName = scan.next();
			String secondName = scan.next();
			int itemsBought = scan.nextInt();
			//Initializes a HashSet to store what unique items this customer has bought
			HashSet<String> uniqueItemsBought = new HashSet<String>();
			//Loops through each item
			while(itemsBought-->0)
			{
				//Takes in the quantity for this specific item and it's name
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				//If this customer has never bought this item, add 1 to the item's value in customerCountMap.
				if(uniqueItemsBought.add(itemName))
					customerCountMap.put(itemName,customerCountMap.get(itemName)+1);
				//Add the amount of times this customer has bought this item to it's quanitityCountMap value.	
				quantityCountMap.put(itemName,quantityCountMap.get(itemName)+itemQuantity);
			}
		}
		//Loops through each item
		for(String item : customerCountMap.keySet())
		{
			//If it's never been bought
			if(customerCountMap.get(item)==0) 
				System.out.println("No customers bought " + item);
			else 
				System.out.println(customerCountMap.get(item) + " customers bought " + quantityCountMap.get(item) + " " + item);
		}
	}
}

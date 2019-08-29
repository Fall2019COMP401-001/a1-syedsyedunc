package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nItems = scan.nextInt();
		HashMap<String,Double> map = new HashMap<String,Double>();
		while(nItems-->0)
		{
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			map.put(itemName,itemPrice);
		}
		int nCustomers = scan.nextInt();
		double biggestSpent = Double.MIN_VALUE;
		String biggestSpentName = "";
		double smallestSpent = Double.MAX_VALUE;
		String smallestSpentName = "";
		double averageSpent = 0;
		for(int i = 0; i < nCustomers; i++)
		{
			String firstName = scan.next();
			String secondName = scan.next();
			int itemsBought = scan.nextInt();
			double totalSpent = 0;
			while(itemsBought-->0)
			{
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				totalSpent += itemQuantity * map.get(itemName);
			}
			if(totalSpent>biggestSpent)
			{
				biggestSpent = totalSpent;
				biggestSpentName = firstName + " " + secondName;
			}
			if(totalSpent<smallestSpent)
			{
				smallestSpent = totalSpent;
				smallestSpentName = firstName + " " + secondName;
			}
			averageSpent += totalSpent;
		}
		averageSpent /= nCustomers;
		System.out.printf("Biggest: %s (%.2f)%n", biggestSpentName, biggestSpent);
		System.out.printf("Smallest: %s (%.2f)%n", smallestSpentName, smallestSpent);
		System.out.printf("Average: %.2f%n", averageSpent);
	}
}

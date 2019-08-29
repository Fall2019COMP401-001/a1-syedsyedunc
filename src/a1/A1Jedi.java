package a1;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashSet;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nItems = scan.nextInt();
		LinkedHashMap<String,Integer> customerCountMap = new LinkedHashMap<String,Integer>();
		LinkedHashMap<String,Integer> quantityCountMap = new LinkedHashMap<String,Integer>();
		while(nItems-->0)
		{
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			customerCountMap.put(itemName, 0);
			quantityCountMap.put(itemName, 0);
		}
		int nCustomers = scan.nextInt();
		for(int i = 0; i < nCustomers; i++)
		{
			String firstName = scan.next();
			String secondName = scan.next();
			int itemsBought = scan.nextInt();
			HashSet<String> uniqueItemsBought = new HashSet<String>();
			while(itemsBought-->0)
			{
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				if(uniqueItemsBought.add(itemName))
					customerCountMap.put(itemName,customerCountMap.get(itemName)+1);
				quantityCountMap.put(itemName,quantityCountMap.get(itemName)+itemQuantity);
			}
		}
		for(String item : customerCountMap.keySet())
		{
			if(customerCountMap.get(item)==0) 
				System.out.println("No customers bought " + item);
			else 
				System.out.println(customerCountMap.get(item) + " customers bought " + quantityCountMap.get(item) + " " + item);
		}
	}
}

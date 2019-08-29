package a1;

import java.util.Scanner;

public class A1Novice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCustomers = scan.nextInt();
		while(nCustomers-->0)
		{
			String firstName = scan.next();
			String lastName = scan.next();
			int nItems = scan.nextInt();
			double totalPrice = 0;
			while(nItems-->0)
			{
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				totalPrice += itemQuantity*itemPrice;
			}
			System.out.printf("%s. %s: %.2f%n",firstName.charAt(0),lastName,totalPrice);
		}
	}
}

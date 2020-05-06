package com.cognizant.mainclass;

import java.util.Scanner;

import com.cognizant.classes.AccessoryOrderRepair;
import com.cognizant.classes.PhoneOrderRepair;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Welcome to our site. Would you like to order or repair");
		Scanner scanner=new Scanner(System.in);
		String processOption=scanner.nextLine();
		PhoneOrderRepair phoneOrderRepair=new PhoneOrderRepair();
		AccessoryOrderRepair accessoryOrderRepair=new AccessoryOrderRepair();
		String productDetails=" ";
		switch(processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetails=scanner.nextLine().trim();
			phoneOrderRepair.processOrder(productDetails);
			break;
		
		case "repair":
			System.out.println("It is the phone or the accessory that you want to be repaired?");
			String productType=scanner.nextLine();
			if (productType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name");
				productDetails=scanner.nextLine().trim();
				phoneOrderRepair.processPhoneRepair(productDetails);
			}
			else
			{
				System.out.println("Please provide the accessory detail, like headphone, tempered glass ");
				productDetails=scanner.nextLine().trim();
				accessoryOrderRepair.processAccessoryRepair(productDetails);
			}
			break;
		default:
			break;
			
	}

}
}

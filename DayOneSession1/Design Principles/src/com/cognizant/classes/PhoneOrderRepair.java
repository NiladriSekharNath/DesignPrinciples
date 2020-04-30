package com.cognizant.classes;

import com.cognizant.interfaces.PhoneRepair;
import com.cognizant.interfaces.ProcessOrder;

public class PhoneOrderRepair implements PhoneRepair,ProcessOrder {



	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println("Repair accepted "+modelName);
		
	}

	@Override
	public void processOrder(String modelName) {
		System.out.println("Order accepted "+modelName);
		
	}

}

package com.cognizant.classes;

import com.cognizant.interfaces.AccessoryRepair;

public class AccessoryOrderRepair implements AccessoryRepair {

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Repair accepted "+accessoryType);
		
	}

	}


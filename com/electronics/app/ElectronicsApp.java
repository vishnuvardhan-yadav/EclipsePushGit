package com.electronics.app;
import com.electronics.devices.Laptop;
import com.electronics.brands.Manufacturer;



import com.electronics.devices.Laptop;

public class ElectronicsApp {
	public static void main(String[] a) {
		
		Laptop lp = new Laptop();
		lp.setModel("Dell");
		lp.setPrice(77000);
		lp.showLaptopDetails();
		
		Manufacturer man = new Manufacturer();
		man.setModel("HP");
		man.setPrice(80000);
		
		
		
	}

}

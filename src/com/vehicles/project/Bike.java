package com.vehicles.project;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	@Override
	protected void checkPlate(String plate) throws Exception {

		if(plate.toUpperCase().matches( "[A-Z]{2,3}-[0-9]{1,4}]")){
			throw new Exception("Has ingresado una matricula incorrecta");
		}

	}

}

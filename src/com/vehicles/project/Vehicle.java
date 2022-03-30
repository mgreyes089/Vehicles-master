package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		checkPlate(plate);
		this.plate = plate;
		this.brand = brand;
		//el check siempre arriba de su atributo
		checkColor(color);
		this.color = color;

	}
	private void checkColor(String color) throws Exception {

		if(color==null || color.equals("")) throw new Exception();

	}

	protected void checkPlate(String plate) throws Exception {

		if(plate.toUpperCase().matches( "[A-Z]{2,3}-[0-9]{1,4}]")){
			throw new Exception("Has ingresado una matricula incorrecta");
		}

	}


}

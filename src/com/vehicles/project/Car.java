package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);

	}



	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
//RESTRICCION DEL VEHICULO QUE LAS CONTIENE
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
// PODRÌA COMPARAR MANUALMENTE PERO UTILIZO EL METODO EQUALS, EN LA CLASE WHEEL
		if (!rightWheel.equals(leftWheel))
			throw new Exception();
// AÑADO LAS RUEDAS A LA RUEDA DEL COCHE
		//WHEELS ES UN ATRIBUTO DE VEHICULO, Y CAR HEREDA DE VEHICULO
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}

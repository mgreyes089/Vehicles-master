package com.vehicles.project;

import java.util.Objects;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		this.brand = brand;
		checkDiameter(diameter);
		this.diameter = diameter;

	}

	private void checkDiameter(double diameter) throws Exception {
		if(diameter <0.4 || diameter >4) throw new  Exception("Ese diametro no es válido");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Wheel)) return false;
		Wheel wheel = (Wheel) o;
		return Double.compare(wheel.diameter, diameter) == 0 && Objects.equals(brand, wheel.brand);
	}

}

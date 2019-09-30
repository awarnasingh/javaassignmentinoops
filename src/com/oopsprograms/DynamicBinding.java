package com.oopsprograms;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Vehicle vehicle = new Car(); //here Type=vehicle but object= Car
	        vehicle.start(); //Car's start called because start() is overridden method
	    }
	}

	class Vehicle {
	    public void start() {
	        System.out.println("Inside start method of Vehicle");
	    }
	}

	class Car extends Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Inside start method of Car");
	    }
	}

package com.oopsprograms;

public class OverridingHuman {

	public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends  OverridingHuman{
	  
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      
	      obj.eat();
	      }
	   }
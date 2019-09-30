package com.oopsprograms;

public class Overloading {
	 public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	}
	class Sample
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
	       obj.disp('a');
	       obj.disp('a',10);

	}

}

package com.wipro.classesandobjects;

class calculator
{
	static double powerInt(int num1,int num2)
	{
		return(Math.pow(num1, num2));
	}
	static double powerDouble(double num1,int num2)
	{
		return(Math.pow((int)num1,num2));
	}
	void show()
	{
		System.out.println();
	}
	
}
public class EXC_C1 {
	public static void main(String[] args) {
		double j=calculator.powerInt(3,2);
		double k=calculator.powerDouble(2,4);
		System.out.println(j+" "+k);
	}

}


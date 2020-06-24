package com.wipro.Inheritance;
public class EXC_i2 {
 

	public static void main(String[] args) {
		
      Employee e=new Employee(20000,2020,"AP2020");
      System.out.println("Employee Details");
      System.out.println("===================================");
      System.out.println("Name of the Employee: "+e.getname());
      System.out.println("salary: "+e.getsalary());
      System.out.println("year: "+e.getyear());
      System.out.println("Insurance Number: "+e.getinsurance());
      
	}
} 

package com.wipro.Inheritance;

class Employee extends Person{
private double salary;
private int year;
private String insurance;
   Employee(double salary,int year,String insurance)
   {
	   super("Gowtham");
	   this.salary=salary;
	   this.year=year;
	   this.insurance=insurance;
   }
   double getsalary()
   {
	   return salary;
   }
   int getyear()
   {
	   return year; 
   } 
   String getinsurance()
   {
	   return insurance;
   }
}
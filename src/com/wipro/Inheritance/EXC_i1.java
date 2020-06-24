package com.wipro.Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Animal eat");
	}
	void sleep()
	{
		System.out.println("Animal sleep");
	}
}
class Bird extends Animal
{
	void eat()
	{
		super.eat();
		System.out.println("Bird eat");
	}
	void sleep()
	{
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("Bird fly");
	}
}
public class EXC_i1 {
	public static void main(String[] args) {
		
      Animal a=new Animal();
      Bird b=new Bird();
      //a.eat();
      a.sleep();
      b.eat();
      b.sleep();
      b.fly();
	}

 
}

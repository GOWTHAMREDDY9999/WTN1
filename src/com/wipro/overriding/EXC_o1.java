package com.wipro.overriding;
class Fruit
{
	private String name;
	private String taste;
	private int size;
	void eat()
	{
		name="banana";
		taste="sweet";
		System.out.println("The name of the firut: "+name);
		System.out.println("The taste of the firut: "+taste);
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("The fruit is apple");
		System.out.println("The taste is sweet");
	}
}
class Orange extends Fruit
{ 
	void eat()
	{
		System.out.println("The fruit is orange");
		System.out.println("The taste is sour");
	}
}
public class EXC_o1 {

	public static void main(String[] args) {
		
     Apple a=new Apple();
     a.eat();
     Orange o=new Orange();
     o.eat();
	}
}

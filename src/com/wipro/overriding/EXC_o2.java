package com.wipro.overriding;
class Shape
{
	void draw()
	{
		System.out.println("Drawing shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class EXC_o2 {
	
	public static void main(String[] args) {
	
      Shape t= new Triangle();
      Shape s=new Square();
      Shape c=new Circle();
      t.draw();
      t.erase();
      s.draw();
      s.erase();
      c.draw(); 
      c.erase();
	}

}

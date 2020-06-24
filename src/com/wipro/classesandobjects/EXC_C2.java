package com.wipro.classesandobjects;
class Box
{
	private int height;
	private int width;
	private int depth;
	public Box(int heigth,int width,int depth)
	{
		this.height=heigth;
		this.width=width;
		this.depth=depth;
	}
	public int volume()
	{
		int volume = height*width*depth;
		return volume;
	}
}

public class EXC_C2 {
	
	public static void main(String[] args) {
		Box box= new Box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	System.out.println("Volume of Box is "+box.volume());
	}
 
}

package com.wipro.flowcontrolstatements;

public class EXE_1B {
	

	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		EXE_1B d=new EXE_1B();
		boolean ans=d.lastDigit(a,b);
		System.out.println(ans);
	}
	boolean lastDigit(int a,int b)
	{
		if(a%10==b%10)
			return true;
		else
			return false;
	}
}

 
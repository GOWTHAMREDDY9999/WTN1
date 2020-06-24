package com.wipro.flowcontrolstatements;

public class EXE_14 {

	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int sum=0,base;
		while(a>0)
		{
			base=a%10;
			sum+=base;
			a=a/10;
		}
		System.out.println(sum);
	}
}


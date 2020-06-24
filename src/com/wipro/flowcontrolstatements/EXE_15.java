package com.wipro.flowcontrolstatements;

public class EXE_15 {

	public static void main(String[] args)
	{
		if(args.length>0)
		{
			int a=Integer.parseInt(args[0]);
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<=i;j++)
					System.out.print("*\t");
				System.out.println();
				
			}
		}
		else
			System.out.println("please enter an integer number");
		
	}
}

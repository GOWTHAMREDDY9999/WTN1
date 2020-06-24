package com.wipro.flowcontrolstatements;

public class EXE_3 {
	
	public static void main(String[] args)
	{
		if(args.length>0)
		{
			int i;
			for(i=0;i<args.length-1;i++)
				System.out.print(args[i]+",");
			System.out.println(args[i]);
		}
		else
			System.out.println("No values");
	}

}

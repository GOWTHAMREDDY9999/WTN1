package com.wipro.Arrays;

public class EXE_A13 {

	public static void main(String[] args)
	{
		int [][]a=new int[2][2]; 
		
		if(args.length==4)
		{
			System.out.println("The given array is:");
			for(int i=0,k=0;i<2;i++)
			{
				for(int j=0;j<2;j++,k++)
				{
					int n=Integer.parseInt(args[k]);
					a[i][j]=n;
				
					System.out.println(a[i][j]+" ");
					
						}
				System.out.println();
			}
			System.out.println("The reverse of the given array is:");
			for(int i=1;i>0;i--)
			{
				for(int j=1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}
		else
		{
			System.out.println("please enter 4 integer numbers");
		}
	}
}



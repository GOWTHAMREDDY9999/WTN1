package com.wipro.Arrays;

public class EXE_A14 {

	public static void main(String[] args)
	{
		int [][]a=new int[3][3];
		int max=0;
		if(args.length==9)
		{
			System.out.println("The given array is:");
			for(int i=0,k=0;i<3;i++)
			{
				for(int j=0;j<3;j++,k++)
				{
					int n=Integer.parseInt(args[k]);
					a[i][j]=n;
					if(a[i][j]>max)
						max=a[i][j];
					System.out.println(a[i][j]+" ");
					
						}
				System.out.println();
			}
			System.out.println("The bigger number in the given array is: "+max);
		}
		else 
		{
			System.out.println("please enter 9 integer numbers");
		}
	}
}

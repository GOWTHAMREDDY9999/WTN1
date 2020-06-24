package com.wipro.Arrays;

public class EXE_A12 {

	public static void main(String[] args)
	{
		int []a=new int[] {1,2,3};
		int []b=new int[] {1,4,5};
		int []c=new int[2];
		c[0]=a[1];
		c[1]=b[1];
		System.out.println(c[0]+" "+c[1]);
	}
}


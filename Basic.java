package arrays;
import java.util.*;
public class Basic 
{
public static void main(String [] args)
{
	try {
	int arr[]= {1,23,42,45,6,6};
	int ar1[]=new int[5];
	for(int i=0;i<5;i++)
	{
		int j=i*20;
		ar1[i]=j;
	}
	System.out.println(arr.length);
	System.out.println(ar1.length);
	System.out.println(ar1[3]);
	arr[2]=4;
	
	System.out.println("final values in arrays ");
	for(int n:ar1)
	{
		System.out.println(n);
	}
	System.out.println("==============================");
	for(int n:arr)
	{
		System.out.println(n);
	}
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array out of bounds ");
	}
	
	
	System.out.println(" now we will go with array list ");
	
	int tab[][]=new int[11][11];
	for(int i=0;i<11;i++)
	{
		for(int j=0;j<11;j++)
		{
			tab[i][j]=i*j;
		}
	}
	for(int[] n:tab)
	{
		for(int x: n)
		{
			System.out.println(x);
		}
	}
}
}

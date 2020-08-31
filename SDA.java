package arrays;
import java.util.*;
public class SDA
{
int arr[];
static int length;

// using constructor to create a array 
 SDA(int n)
 {
	
	 arr=new int[n];
	 length= n;
 }
 // Initializing the array
 void intialization()
 {
	 for(int i=0;i<length;i++)
	 {
		 arr[i]=Integer.MIN_VALUE;  // inbuilt command for min value : -2147483648
     }
	 System.out.println(" the intilaized values are : ");
	 
	 for(int i=0;i<length;i++)
	 {
		 System.out.println(arr[i]);  // inbuilt command for min value 
     }
 }
 
 
 // Inserting some new values  :  vTBI- value to be Inserted
 
 void insert(int location,int vTBI)
 {
	 try
	 {
		 if(arr[location]==Integer.MIN_VALUE)
		 {
			 arr[location]=vTBI;
		 }
		 else
			 System.out.println("the location has some other value ");
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println(e);
	 }
	 
 }
 
 
 // traversing the array
 
 void traverseAry()
 {
	 try
	 {
		 for(int i=0;i<length;i++)
		 {
			 System.out.println(arr[i]+"  ");
		 }
	 }
	 catch(Exception e)
	 {
		 System.out.println("array no longer exists :  "+e);
	 }
 }
 
 
 // Accessing a  value 
 
 void Accessing( int k)
 {
	 try
	 {
		 System.out.println(arr[k]);
	 }
	 catch(Exception e)
	 {
		 System.out.println("array index no longer exists :  "+e);
	 }
 }
 
 

 // searching for an element
  void search(int g)
  {
	  try
	  {
		  for(int i=0;i<length;i++)
		  {
			  if(arr[i]==g)
			  {
				  System.out.println("the location of the element is "+i);
			  }
			  else
				  System.out.println("element not present in this array");
		  }
	  }
	  catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
	  
  }
  
  
 // deleting value of array
  void delete(int j)
  {
	  try
	  {
		  arr[j]=Integer.MIN_VALUE;
		  
	  }
	  catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
  }
  
  
 // deleting the entire array
  void deletion()
  {
	  arr=null;
	  System.out.println(" array has been successfully deleted ");
  }
  
  
  public static void main(String [] args)
  {
	  
	  SDA arr=new SDA(10);
	  
	  arr.intialization();
	  
	  arr.insert(4, 4444);
	  arr.insert(2, 2222);
	  arr.insert(3, 3333);
	  arr.insert(7, 7777);
	  arr.insert(9, 9999);
	  
	arr.traverseAry();
	arr.Accessing(9999);
	arr.search(9999);
	arr.delete(3);
	arr.traverseAry();
	
		 
		
	 
	  
  }
}

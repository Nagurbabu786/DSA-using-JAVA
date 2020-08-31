package arrays;
public class TDA
{
	int arr[][];
	static int length;
	static int length1;
	
	TDA(int n,int m)
	{
		 arr = new int[n][m];
		 length=arr.length;
		 length1=m;
	}
	
	// Initializing 
	
	void intialize()
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length1;j++)
			{
				arr[i][j]=Integer.MIN_VALUE;
				
			}
		}
	}
	
	// traversing
	void traverse()
	{
		try
		{
			for(int i=0;i<length;i++)
			{
				for(int j=0;j<length1;j++)
				{
				System.out.println(arr[i][j] +" ");	
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//insertion
	void insert(int row,int col, int VTBI)
	{
		try
		{
			if(arr[row][col]==Integer.MIN_VALUE)
			{
				arr[row][col]=VTBI;
			}
			else
			{
				System.out.println("The value is already occupied ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//Accessing
  void acess(int n,int m)
  {
	  try
	  {
		 System.out.println(arr[n][m]); 
	  }
	  catch(Exception e)
	  {
		  
		 System.out.println(" the index entered is invalid "+e); 
	  }
  }
  
  // searching 
  
  void search(int x)
  {
	  try
		{
			for(int i=0;i<length;i++)
			{
				for(int j=0;j<length1;j++)
				{
				if(arr[i][j]==x)
				{
					System.out.println(" the index value of that respective element is arr["+i+" ," +j+" ]");
				}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
  }
  
 // deleting
  
  void delete(int b)
  {
	  try
		{
			for(int i=0;i<length;i++)
			{
				for(int j=0;j<length1;j++)
				{
                   if(arr[i][j]==b)
                     {
                       arr[i][j]=Integer.MIN_VALUE;
                     }
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
  }
  
  // deleting entire array 
  
  void deletion()
  {
	  arr=null;
  }
  
  public static void main(String[] args)
  {
	  TDA array=new TDA(5,6);
	  array.intialize();
	  array.traverse();
	  array.insert(2,4,223344);
	  array.insert(3,4,223344);
	  array.insert(4,4,223344);
	  array.insert(5,4,223344);
	  array.insert(2,3,223344);
	  array.insert(2,4,223344); 
	  array.insert(2,5,223344);
	  System.out.println(" after inserting" );
	  array.traverse();
	  array.acess(2, 7);
	  array.search(223344);
	  array.delete(223344);
	  array.traverse();
	  System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	  array.deletion();
	  System.out.println("after deleting the entire array ");
	  array.traverse();
	  
  }
  
}

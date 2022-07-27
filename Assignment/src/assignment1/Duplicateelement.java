package assignment1;

public class Duplicateelement {
	public static void main(String[] args) {
		//         0  1  2  3   4  5  6  7  8  9  10 11 12 13 14 15 index
		int ar[]= {10,25,41,30,74,85,95,74,25,55,85,78,96,20};
		//         1  2  3  4  5  6  7  8 9  10  11 12 13 14 15 16 lenght

		
		  for(int i=0; i<=ar.length-1;i++)   {
         
           
          for(int j=i+1; j<=ar.length-1;j++) 
              {
        	  
        	  if ((ar[i]==ar[j]) && (i!=j)) {
        		  
        		  System.out.print(ar[j] +" ");
        	  }
              }

		  }

	}
	}
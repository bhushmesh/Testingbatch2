package assignment1;

public class Assendingorderarray_2 {
	
	public static void main(String[] args) {
		//         0  1  2  3   4  5  6  7  8  9  10 11 12 13 14 15 index
		int ar[]= {10,25,41,30,74,85,95,74,25,55,85,78,96,20};
		//         1  2  3  4  5  6  7  8 9  10  11 12 13 14 15 16 lenght
	int min, temp=0;
		
		  for(int i=0; i<=ar.length-1;i++)   {//16-1=15
           min = i;// 0 
           
          for(int j=i+1; j<=ar.length-1;j++) //
              {
        	  if (ar[j]<ar[min]) {// 
        		  min=j;
        	  }
        	  }
        		  temp=ar[i];
        		  ar[i]=ar[min];
        		  ar[min]=temp;
			   System.out.println("github");
        		  System.out.println(ar[i]);
        	  }
         
	}}
	



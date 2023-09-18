package array;
import java.util.*;
public class Diagonal_Diffrence {

		public Diagonal_Diffrence(int arr[][],int size) {
			// TODO Auto-generated constructor stub
			int left=0,right=0;
			for(int i=0;i<size;i++)
			{
				left+=arr[i][i];
			}
			for(int i=0,j=size-1;i<size && j>=0;i++,j--)
			{
				right+=arr[i][j];
		    }
			System.out.println(Math.abs(right-left));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Scanner in=new Scanner(System.in);
			System.out.println("Enter the Number of rows and columns of matrix");
	       int size=in.nextInt();
	       int arr[][]=new int[size][size];
	       System.out.println("Enter the Elements of matrix");
	       for(int i=0;i<size;i++)
	         for(int j=0;j<size;j++)
	        	 arr[i][j]=in.nextInt();
	       
	       Diagonal_Diffrence obj=new Diagonal_Diffrence(arr,size); 
		}
}

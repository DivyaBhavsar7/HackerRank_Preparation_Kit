import java.io.*;
import java.util.*;

class Result {
    
     public static int lonelyinteger(int arr[]) {
         
        Arrays.sort(arr);
        boolean flag;
        for(int i=0;i<arr.length;i++)
        {
            flag=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=false;
                    i=j;
                }  
            }
            if(flag==true)
              return arr[i];
        }
        return 1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=in.nextInt();
          
        Result obj=new Result();
        int value=obj.lonelyinteger(arr);
        System.out.println(value);
    }
}

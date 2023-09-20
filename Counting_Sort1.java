import java.util.*;

class Counting_Sort {

    public void Counting(int arr[],int size) {
        int count[]=new int[100];
        Arrays.fill(count, 0);
        
        for(int i=0;i<size;i++)
        {
            int ele=arr[i];
            count[ele]++;
        }
        for(int i=0;i<100;i++)
            System.out.print(count[i]+" ");
}
}
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        
        Counting_Sort obj=new Counting_Sort();
        obj.Counting(arr, size);
    }
}

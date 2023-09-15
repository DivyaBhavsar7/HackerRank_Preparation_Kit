import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
    
    int p=0;
    int n=0;
    int z=0;
    int size=arr.size();
     for(int i=0;i<size;i++)
     {
         int element=arr.get(i);
         if(element<0)
            n++;
         else if(element==0)
            z++;
         else 
            p++;  
     }
     
     System.out.println((double)p/size);
     System.out.println((double)n/size);
     System.out.println((double)z/size);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

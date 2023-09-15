import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
   
    long min=0;
    long max=0;
    
    for(int i=0;i<5;i++)
    {
        long sum=0;
        for(int j=0;j<5;j++)
        {
            if(i!=j)
              sum=sum+arr.get(j);
        }
        if(i==0)
          min=max=sum;
        else if(min>sum)
          min=sum;
        else if(max<sum)
        max=sum;
    }
    System.out.println(min+" "+max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


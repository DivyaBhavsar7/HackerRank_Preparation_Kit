import java.io.*;

class Result {

    public static String timeConversion(String s) {
       String Result="";
        String arr[]=s.split(":");
        String sec=arr[2].substring(0, 2);
        String post=arr[2].substring(2, 4);
        
        int hrs=Integer.parseInt(arr[0]);
       
        
        if(hrs < 12 && post.equals("PM"))
           hrs=12+hrs;
        else if(hrs==12 && post.equals("AM"))
           hrs=00;
        
        String formHrs = String.format("%02d", hrs);
        
        Result=formHrs+":"+arr[1]+":"+sec;
        return Result;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

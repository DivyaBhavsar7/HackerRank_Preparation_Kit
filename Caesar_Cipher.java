import java.io.*;

class Result {
    public static String caesarCipher(String str, int k) {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch;
            if(Character.isUpperCase(str.charAt(i)))
            {
                ch=(char)(((int)(str.charAt(i)+ k - 65) % 26 + 65));
                result+=ch;
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                ch=(char)(((int)(str.charAt(i)+ k - 97) % 26 + 97));
                result+=ch;
            }
            else
            {
                ch=(char)(str.charAt(i));
                result+=ch;
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

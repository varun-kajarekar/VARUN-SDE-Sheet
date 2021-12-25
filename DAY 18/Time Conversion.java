//   https://www.hackerrank.com/interview/preparation-kits/one-month-preparation-kit/one-month-week-one/challenges


/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.


Sample Input    07:05:45PM
Sample Output   19:05:45
*/






import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String inp) {
            
            StringBuilder imp = new StringBuilder(inp);
            imp.delete(8, 10);
            int hour0 = (int) imp.charAt(0)-48;
            int hour1 = (int) imp.charAt(1)-48;
            String hour = String.valueOf(hour0) + String.valueOf(hour1);
            int h = Integer.valueOf(hour);
            if(inp.charAt(8)=='P'){
                if(imp.charAt(0)=='1'&& imp.charAt(1)=='2'){
                    String out = imp.toString();
                    return out;
                }
                else{
                    int out3 = 12+h;
                    String out1 = String.valueOf(out3);
                    imp.delete(0, 2);
                    String out = imp.toString();
                    out = out1+out;
                    return out;
                }
               
            }
            else if(imp.charAt(0)=='1'&& imp.charAt(1)=='2'&&inp.charAt(8)=='A'){
                    imp.delete(0, 2);
                    String out = imp.toString();
                    out = "00"+out;
                    return out;
                }
            return imp.toString();

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

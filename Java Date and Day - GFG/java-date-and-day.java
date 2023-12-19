//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String findDay(int Day, int Month, int Year){
        Calendar cal = Calendar.getInstance();
        
        cal.set(Year,Month-1,Day);
int value = cal.get(Calendar.DAY_OF_WEEK);
String day="";
switch(value){
case 1:
day="SUNDAY";
break;
case 2:
day="MONDAY";
break;
case 3:
day="TUESDAY";
break;
case 4:
day="WEDNESDAY";
break;
case 5:
day="THURSDAY";
break;
case 6:
day="FRIDAY";
break;
case 7:
day="SATURDAY";
break;
    }
    return day;
}
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split(" ");
            
            String day = input_line[0];
            String month = input_line[1];
            String year = input_line[2];
            int yyyy = Integer.parseInt(year);
            int mm = Integer.parseInt(month);
            int dd = Integer.parseInt(day);

            Solution ob = new Solution();
            System.out.println(ob.findDay(dd,mm,yyyy));
        }
    }
}
// } Driver Code Ends
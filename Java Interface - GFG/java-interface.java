//{ Driver Code Starts
//Initial Template for Javaimport java.io.*;

import java.util.Scanner;

interface in1
{
    void display(int p);
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int k= sc.nextInt();
        testClass p = new testClass();
        p.display(k);
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class testClass implements in1
{
    public void display(int k)
    {   
          int count1 = 0;
for (int i = 2; i <= k; i++) {
int count = 2;
for (int j = 2 ; j < (i/2)+1; j++) {
if (i % j == 0) {
count = 3;
break;
}
}
if (count == 2) {
count1++;
 
}
 
}
System.out.println(count1);
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
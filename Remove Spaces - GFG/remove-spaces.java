//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String modify(String input)
    {
        // your code here
           StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    
    }
}
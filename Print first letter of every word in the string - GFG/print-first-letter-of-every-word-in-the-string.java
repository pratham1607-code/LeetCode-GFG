//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String str) {
         StringBuilder result = new StringBuilder();

        // Split the string into words
        String[] words = str.split(" ");

        // Extract the first letter of each word and append to the result
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = word.charAt(0);
                result.append(firstLetter);
            }
        }

        return result.toString();
        // code here
    }
};
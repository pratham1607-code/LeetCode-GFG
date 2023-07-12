//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int s=0;
        int e=n-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                idx=mid;
                break;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return idx;
    }
}
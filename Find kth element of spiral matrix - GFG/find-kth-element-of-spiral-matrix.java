//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int n, int m, int k)
    {
	// Your code here	
	int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = m - 1;
        int direction = 0;
        int count = 0;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            if (direction == 0) {  // Traverse from left to right
                for (int i = leftCol; i <= rightCol; i++) {
                    count++;
                    if (count == k)
                        return matrix[topRow][i];
                }
                topRow++;
            } else if (direction == 1) {  // Traverse from top to bottom
                for (int i = topRow; i <= bottomRow; i++) {
                    count++;
                    if (count == k)
                        return matrix[i][rightCol];
                }
                rightCol--;
            } else if (direction == 2) {  // Traverse from right to left
                for (int i = rightCol; i >= leftCol; i--) {
                    count++;
                    if (count == k)
                        return matrix[bottomRow][i];
                }
                bottomRow--;
            } else if (direction == 3) {  // Traverse from bottom to top
                for (int i = bottomRow; i >= topRow; i--) {
                    count++;
                    if (count == k)
                        return matrix[i][leftCol];
                }
                leftCol++;
            }
            direction = (direction + 1) % 4;
        }
        return -1;
    }
}
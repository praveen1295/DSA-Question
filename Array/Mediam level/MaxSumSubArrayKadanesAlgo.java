public class MaxSumSubArrayKadanesAlgo {
    public static void main(String[] args) {
        int arr[] = { -1, -5, 5, 4, -8, -7, -2, -6 }; 
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        // int idx = 0;
        for (int i = 0; i < n; i++) {   // Kadanes Algorithm Time complexity O(n);
            curSum = curSum + arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
                // idx = i;
                // System.out.print(idx+" ");
                // System.out.println(arr[i]);
            } else if (curSum < 0) {
                curSum = 0;

            }
        }
        System.out.println(maxSum); 
    }
}


/*.........................................................................................................
// Or time complexity O(n2);

public class MaxSumSubArrayKadanesAlgo {
        int arr[] = {-1,-5,5,4,8,7,-2,0,6};
        int n = arr.length;
        
        int maxSum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int curSum = arr[i];
            for(int j=i+1; j<n; j++){
                curSum = curSum+arr[j];
                if(curSum>maxSum){
                    maxSum = curSum;
                }
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(maxSum);
    }
}
*/

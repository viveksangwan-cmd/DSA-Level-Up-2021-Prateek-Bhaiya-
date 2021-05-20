package Arrays;

import java.util.Scanner;

public class Rains {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = rains(arr);
        System.out.println(l);
    }

    private static int rains(int[] arr) {
        int s = arr.length;
        if(s<=2) return 0;
        int left[] = new int[s];
        int right[] = new int[s];
        left[0] = right[s-1] = 0;

        for(int i=1;i<s;i++){
            left[i] = Math.max(arr[i],left[i-1]);
            right[s-i-1] = Math.max(right[s-i],arr[s-i-1]);
        }
        int ans = 0;
        for(int i=0;i<s;i++){
            int minCurrent = Math.min(left[i], right[i]);
            if(minCurrent > arr[i]){
                ans += minCurrent - arr[i];
            }
        }
        return ans;
    }

}

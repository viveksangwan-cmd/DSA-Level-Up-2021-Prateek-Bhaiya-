package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_Band {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = longestBand(arr);
        System.out.println(l);
    }

    private static int longestBand(int[] arr) {
        if(arr.length==0) return 0;
        int ans = 1;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i]-1)){
                int count = 1;
                int currentValue = arr[i];
                while(s.contains(currentValue+1)){
                    count++;
                    currentValue++;
                }
                ans = Math.max(count,ans);
            }
        }
        return ans;
    }
}

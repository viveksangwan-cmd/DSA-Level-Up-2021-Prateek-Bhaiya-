package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Moutains {

    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = mountain(arr);
        System.out.println(l);
    }

    private static int mountain(int[] arr) {
        int ans = 0;
        List<Integer> mountainPeeksIndex = new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                mountainPeeksIndex.add(i);
            }
        }

        for(Integer i:mountainPeeksIndex){
            int count = 1;

            int left = i-1;
            while(left>=0 && arr[left]<arr[left+1]){
                count++;
                left--;
            }

            int right = i+1;
            while(right<arr.length && arr[right]<arr[right-1]){
                count++;
                right++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}

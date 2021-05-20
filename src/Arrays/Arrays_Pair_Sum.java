package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Arrays_Pair_Sum {
    public static List<Integer> pairSum(int arr[],int targetSum){
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int otherValueNeeded =  targetSum - arr[i];
            if(m.containsKey(otherValueNeeded)){
                ans.add(arr[i]);
                ans.add(otherValueNeeded);
                return ans;
            }
            m.put(arr[i],1);
        }
        return ans;
    }

    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        List<Integer> l = pairSum(arr,targetSum);
        for(Integer i:l){
            System.out.println(i);
        }
    }
}

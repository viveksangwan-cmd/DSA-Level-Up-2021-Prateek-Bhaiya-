package Arrays;

import java.util.*;

public class Triplets {
    public static List<List<Integer>> triplets(int arr[], int targetSum){
//        Sorting the arr O(nlogn)
        System.out.println("Triplets Problem");
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            int leftSum =  targetSum - arr[i];
            int left = i+1;
            int right = arr.length - 1;
            while(left<right){
                if(arr[left]+arr[right]==leftSum){
                    List<Integer> current = new ArrayList<>();
                    current.add(arr[i]);
                    current.add(arr[left]);
                    current.add(arr[right]);
                    ans.add(current);
                    left++;
                    right--;
                }else if(arr[left]+arr[right]<leftSum){
                    left++;
                }else if(arr[left]+arr[right]>leftSum){
                    right--;
                }
            }
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
        List<List<Integer>> l = triplets(arr,targetSum);
        for(List<Integer> i:l){
            for(Integer x:i){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}

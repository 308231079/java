import java.util.Arrays;
import java.util.Scanner;

public class 随便 {
    public static void main(String[] arge){
         Solution s = new Solution();
         int[] num = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(s.sortedSquares(num)));
    }
    static class Solution {
       public int[] sortedSquares(int[] nums) {
            int[] arr = new int[nums.length];
            int p1=0;
            int p2 = nums.length-1;
            int i=nums.length-1;
            while(p1<=p2){
                if(Math.abs(nums[p1])>Math.abs(nums[p2])){
                    arr[i--] = nums[p1]*nums[p1];
                    p1--;
                    if(i<0){
                        break;
                    }
                    arr[i] =  nums[p2]*nums[p2];
                    p2--;
                }
                else{
                    arr[i--] =  nums[p2]*nums[p2];
                    p2--;
                    if(i<0){
                        break;
                    }
                    arr[i] = nums[p1]*nums[p1];
                    p1++;
                }
                i--;
            }
            return arr;
        }
    }
}

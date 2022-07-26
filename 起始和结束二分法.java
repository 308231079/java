import java.util.Arrays;

public class 起始和结束二分法 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,4,5,6,6,6,9,23};
       int[] arr= searchRange(nums,6);

        System.out.println(Arrays.toString(arr));
    }


        public static int[] searchRange(int[] nums, int target) {
            int left=0;
            int right=nums.length-1;
            do{
                int mid = (right-left)/2+left;
                if(target==nums[mid]){                  //这里加入了左右排查的方法，从而找出左右相同的数字
                    int p1=mid;
                    for(;nums[p1+1]==nums[mid];){
                        p1++;
                    }
                    int p2=mid;
                    for(;nums[p2-1]==nums[mid];){
                        p2--;
                    }
                    int[] arr=new int[]{p2,p1};
                    return arr;
                }
                else if(target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }while(right>=left);                       //经典的二分法算法（可以确定其中一个目标数的位置）
            int arr[] = new int[]{-1,-1};
            return arr;
        }
}

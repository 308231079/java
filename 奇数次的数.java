public class 奇数次的数 {  //求出出现奇数次的数
    public static void main(String[] args){
        int[] arr = {1,3,1,2,2,3,2}; //只能应对一个奇数次
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            m = arr[i]^m;
        }
        System.out.println("奇数次的数是："+m);
    }
}

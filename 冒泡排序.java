import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,4,5,9,65,45,32,72,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        String s = Arrays.toString(arr);
        System.out.println("排序后："+s);
    }
}

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,4,5,9,65,45,32,72,9};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        String s = Arrays.toString(arr);
        System.out.println("排序后："+s);
    }
}

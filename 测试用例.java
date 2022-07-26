import java.util.Arrays;

class 测试用例{
    public static void main(String[] args) {
        int arr[] = {3,5,34,24,65,27,29,4,1,945,35,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("arr[]="+Arrays.toString(arr));
    }
}

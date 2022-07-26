import java.util.ArrayList;
import java.util.Arrays;

class arraylistsort___char {
    public static void main(String[] args){
        float[] arr = new float[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)((100*Math.random()));
        }

        char[] arr_Char = new char[1000];
        for (int i = 0; i < arr_Char.length; i++) {
            arr_Char[i] = (char)((Math.random()*26)+65);
        }
        ArrayList<String> as = new ArrayList<>();


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr_Char);
        System.out.println(Arrays.toString(arr_Char));

    }
}

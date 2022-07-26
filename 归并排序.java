import java.lang.reflect.Array;
import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args){
        int arr[] ={4,2,425,2,6,6,5,22,4,5,234,5,2,34,5,24,5,23,46,2};
        process(arr,0, arr.length-1);
        String s = Arrays.toString(arr);
        System.out.println("arr:"+s);
    }

    public static void process(int[] arr, int L,int R){
        if (L==R){
            return;
        }
        int mid = L+((R-L)>>1); //位运算除2
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr, int L, int M, int R ){
        int []help = new int[R - L+1];
        int i=0;
        int p1=L;
        int p2=M+1;
        while (p1<=M&&p2<=R){
            help[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=M){
            help[i++]=arr[p1++];
        }
        while (p2<=R){
            help[i++] = arr[p2++];
        }
        for (i=0;i<help.length;i++){
            arr[L+i] = help[i];
        }
    }
}

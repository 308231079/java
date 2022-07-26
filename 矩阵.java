import java.util.Scanner;
public class 矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入正方形矩阵的大小：");
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        int max = n*n;
        int num=0;
        int co=0;
        do{
            int i=0,j=0;
            if(co%2==0){
                for(i=co;i<=co-i;i++){
                    arr[co-i][i]=num++;
                }
            }
            else {
                for(j=co;j<=co-j;j++){
                    arr[co-j][j]=num++;
                }
            }
            co++;
        }while(co<max);
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n
                    ; l++) {
                System.out.print(arr[l][k]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class 阶乘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数以计算阶乘");
        int num= sc.nextInt();
        System.out.print(num+"的阶乘是：");
        System.out.print(fn(num));
    }
    static int fn(int n){
        if(n==1){
            return n;
        }
        else if(n==0){
            return 1;
        }
        else {
           return n=n*fn(n-1);
        }
    }

}

import java.util.Scanner;

public class 打印金字塔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int num = sc.nextInt();
        for (int y = 0; y < num+1; y++) {
            for (int i=0;i<num-y;i++){
                System.out.print(" ");
            }
            for (int x = 0; x < y*2-1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

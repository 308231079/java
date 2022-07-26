import java.util.Scanner;

public class 打印菱形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数:");
        int num = sc.nextInt();
        for (int y = 0; y < num+1; y++) {
            for (int i = 0; i < num-y; i++) {
                System.out.print(" ");
            }
            for (int x = 0; x < y*2-1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int y = num-1; y > 0 ; y--) {                  //num+1    y--第几层
            for (int i = num-y; i >0; i--) {                //num-y    第y层的空格数
                System.out.print(" ");
            }
            for (int x = y*2-1; x > 0 ; x--) {              //y*2-1    第y层的星星数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

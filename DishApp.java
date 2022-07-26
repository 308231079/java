import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishApp {
    //static的List，能够被其他方法所调用
    static List<Dish> dishList = new ArrayList<>();
    static List<Dish> personDishList = new ArrayList<>();
    public static void main(String[] args) {
        initDish();
        Scanner s = new Scanner(System.in);
        while (true){
            showMenu();
            System.out.println("请输入编号");
            int num = s.nextInt();
            System.out.println("你输入的值是"+num);
            switch (num) {
                case 1 : showMenuDish(); break;
                case 2 : showPersonDish(); break;
                case 3 : buy(); break;
                default :
                    System.out.println("程序退出");
                    System.exit(0);
            }
        }
    }
    //载入初始List
    public static void initDish(){
        dishList.add(new Dish(1,"香辣肉丝",29.0));
        dishList.add(new Dish(2,"炖王八",  59.0));
        dishList.add(new Dish(3,"家常凉菜",21.0));
        dishList.add(new Dish(4,"地三鲜",  24.0));
    }
    //显示主菜单的内容
    public static void showMenu(){
        System.out.println("-------主菜单--------");
        System.out.println("菜单\t\t\t1");
        System.out.println("已点菜单\t\t2");
        System.out.println("买单\t\t\t3");
        System.out.println("--------其余键退出------------");

    }
    //展示List的内容
    public static void showMenuDish(){
        System.out.println("\n\n---------菜单------------");
        for (Dish dish : dishList) {
            System.out.println("" + dish.id + "\t" + dish.name + "\t" + dish.price);
        }
        System.out.println("--------按0退出------------");
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            for (Dish dish : dishList) {
                if (num == dish.id) {
                    System.out.println("添加菜品--" + dish.name);
                    personDishList.add(dish);
                } else if (num == 0) {
                    return;
                }
            }
        }
    }

    //显示个人已点的菜单
    public static void showPersonDish(){
        System.out.println("\n\n---------已点菜单--------");
        if(personDishList.size()==0){
            System.out.println("您还没有点菜");
        }
        for (Dish dish : personDishList) {
            System.out.println("" + dish.id + "\t" + dish.name + "\t" + dish.price);
        }
        System.out.println("------------------------");
    }
    public static void buy(){
        int sum=0;
        for (Dish dish : dishList) {
            sum += dish.price;
        }
        System.out.println("\n总价格为"+sum);
        System.out.println("买单成功");
        personDishList.clear();
        sum=0;
    }
}

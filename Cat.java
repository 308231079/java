public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int id, String name, int age) {
    }

    @Override
    public void food() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫在猫窝里睡觉");
    }

    public void catches() {
        System.out.println("猫可以抓老鼠");
    }

    @Override
    public void introduce() {
        System.out.println("我是个猫");
    }

}

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void food() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗躺在地上睡觉");
    }

    public void wanwan() {
        System.out.println("狗可以看门，wanwanwan");
    }

    @Override
    public void introduce() {
        System.out.println("我是个狗");
    }

}

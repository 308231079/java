public class Bird extends Animal implements Fly {
    public Bird() {
    }

    public Bird(int id, String name, int age) {
//        super(id, name, age);
          this(id);    //调用自己的构造函数
    }
    public Bird(int id){
        System.out.println("id构造函数被调用");
    }


    @Override
    public void food() {
        System.out.println("鸟吃虫子");
    }

    @Override
    public void sleep() {
        System.out.println("鸟在树上睡觉");
    }

    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }

    public void song() {
        System.out.println("鸟可以唱歌");
    }
}

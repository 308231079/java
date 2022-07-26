public class Demo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("小黄");
        dog1.setAge(7);
        dog1.setId(1);

        Cat cat1 = new Cat(2,"小花",4);

        Bird bird1 = new Bird(3,"小灰",3);

        dog1.eat();
        cat1.eat();
        bird1.eat();

        dog1.food();
        cat1.food();
        bird1.food();

        dog1.sleep();
        cat1.sleep();
        bird1.sleep();

        dog1.wanwan();
        cat1.catches();
        bird1.fly();

        Animal.fff();



    }
}

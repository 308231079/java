abstract public class Animal {
    int id;
    String name;
    int age;

    public Animal() {

    }

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("我是Animal对象");
    }

    public void eat() {
        System.out.println("Animal吃东西");
    }

    abstract public void food();

    abstract public void sleep();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static public void fff() {
        System.out.println("使用static方法不需要产生对象");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Visitor {

    private int age;
    private int height;
    private int money;

    public Visitor(int age, int height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMoney() {
        return this.money;
    }
}

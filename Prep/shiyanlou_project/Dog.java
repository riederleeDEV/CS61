public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog Bark");
    }

    void barkTest() {
        this.bark();
        super.bark();
    }

    //子类自己的方法
    public void dogType() {
        System.out.println("这是什么品种的狗？");
    }
}


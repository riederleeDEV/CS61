public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog Bark");
    }

    void barkTest() {
        this.bark();
        super.bark();
    }
}


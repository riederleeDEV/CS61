public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
        this.noise = "Meow";
    }

    public String makeNoise() {
        if (age < 5) {
            return noise.toUpperCase();
        } else {
            return noise;
        }
    }

    public void greet() {
        System.out.println("Cat " + name + " says: " + makeNoise());
    }

    public static void main(String[] args){
        Cat catTest = new Cat("Jason", 3);
        String returnString = catTest.makeNoise();
        System.out.println(returnString);
    }
}
public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);
        Dog d = new Dog("Fido", 4);
        a.greet(); // (A) _____Animal Pluto says Huh?_________________
        c.greet(); // (B) _____Cat Garfield says meow________________
        d.greet(); // (C) _____Dog Fido says Woof!_________________
        a = c;
        ((Cat) a).greet(); // (D) ___Cat Garfield says: Meow___________________
        a.greet(); // (E) ________Cat Garfield says: Meow______________
    }
}
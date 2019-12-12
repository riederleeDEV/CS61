public class Test{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Dog d = new Dog(); 

        a.bark();
        b.bark();
        //b.dogType(); 
        //b.dogType()编译不通过
        d.bark();
        d.dogType();
    }
}
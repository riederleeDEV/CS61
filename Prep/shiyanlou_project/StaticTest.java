public class StaticTest{
    public static String string = "ShiyanLou";

    public void printShiYan() {
        System.out.println(string);
    }

    public static void main(String[] args){
        StaticTest test = new StaticTest();
        test.printShiYan();
    }
}
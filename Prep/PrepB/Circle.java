public class Circle{
    public double radius;
    public String color;

    public double diameter(double diameter){
        double result = 3.1415*diameter;
        return result;
    }
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.radius = 6;
        circle.color = "red";
        System.out.println(circle.diameter((circle.radius)*2));
    }
}
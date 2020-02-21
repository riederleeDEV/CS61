

public class Square extends Shape {
    int width, height;

    public Square(String name, int x, int y){
        super(name);
        this.width = x;
        this.height = y;
    }

    public double area(){
        return (this.width*this.height);
    }

    public static void main(String[] args){
        Square square = new Square("Square", 1, 2);
        square.moveTo(1,2);
        System.out.println(square.area());
    }

}
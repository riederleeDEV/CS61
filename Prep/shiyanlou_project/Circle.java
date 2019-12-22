class Circle extends Shape 
{ 
    double radius; 
      
    

    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
       
        return "Circle color is " + super.color +  
                       " and area is : " + area(); 
    } 

    public static void main(String[] args){
        Circle circle = new Circle("red", 12);
        System.out.println(circle.toString());
    }
      
} 
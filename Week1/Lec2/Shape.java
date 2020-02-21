abstract class Shape {
    String objectName = "" ;
    
    public Shape(String name){
        this.objectName = name;
    }

    public void moveTo(int x, int y){
        System.out.println(this.objectName + " " + "has been shipped!" + "x: " + x + "    " + "y: " + y);
    }

    abstract public double area();

}


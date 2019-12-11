public class NewObject {

    double height;

    public void setHeight(double h){
        height = h;
    }

    public double returnHeight(){
        return height;
    }

    public static void main(String[] args){
        NewObject oj = new NewObject();
        oj.setHeight(2.3);
        System.out.println(oj.returnHeight());
    }
}
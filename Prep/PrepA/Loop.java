public class Loop {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        // for each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String car:cars){
            System.out.println(car);
        }
    }
}
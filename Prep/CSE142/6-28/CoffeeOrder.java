public class CoffeeOrder {
    public static void main(String[] args) {
       // latte ($5.50), frappuccino ($6.25), drip ($2.00)
       // Alex: latte, Anjali: frap, Jeremy: latte, Mino: drip
       
       double lattePrice = 5.50;
       double frapPrice = 6.25;
       double dripPrice = 2.00;
       int numLatte = 2;
       
       double subtotal = numLatte * lattePrice + frapPrice + dripPrice;
       double tax = subtotal * 0.095;
       double discount = subtotal * 0.05;
 
       System.out.println("Subtotal: $" + subtotal);
       System.out.println("Tax: $" + tax);
       System.out.println("Discount: ($" + discount + ")");
       System.out.println("TOTAL: $" + (subtotal- discount + tax));
    }
 }
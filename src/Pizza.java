import hsa.*;


public class Pizza {

    
    public static void main(String[] args) {
      Console c = new Console();
      double price,base;
      int size,toppings;
      base = 1.25;
      
      while(true){
      c.print("Enter the size of your pizza in inches (10-40): ");
      size = c.readInt();
      if(size >=10 && size <=40) break;
      }
      
      while(true){
      c.print("Enter the amount of toppings you want (0-12): ");
      toppings = c.readInt();
      if(toppings >=0 && toppings <=12) break;
      }
      
      price = (0.5 * size) + (toppings * 0.75) + base;
      c.print("The total cost of your pizza is $" + price);
    }
    
}

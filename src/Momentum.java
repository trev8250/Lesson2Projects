import hsa.*;

public class Momentum {

    
    public static void main(String[] args) {
       Console c = new Console();
       double mass,v,mm;
       c.print("Enter objects mass (kg): ");
       mass = c.readDouble();
       c.print("Enter objects velocity (m/s): ");
       v = c.readDouble();
       mm = mass * v;
       c.print("The momentum of the object is " + mm + " kg m/s");
    }
    
}

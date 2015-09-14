import hsa.*;
import TurtleGraphics.*;
import java.awt.Color;


public class BarGraph {

   
    public static void main(String[] args) {
        Console c = new Console();
        float val1,val2,val3,val4;
        SketchPadWindow win = new SketchPadWindow(400,400);
      Pen p = new StandardPen(win);
      c.print("Enter your first value (0-200) -> ");
              val1 = c.readFloat();
              c.print("Enter your second value (0-200) -> ");
             val2 = c.readFloat();
             c.print("Enter your third value (0-200) -> ");
              val3 = c.readFloat();
              c.print("Enter your fourth value (0-200) -> ");
             val4 = c.readFloat();
       p.up();
       p.move(-150,150);
       p.down();
       p.move(-150,-100);
       p.turn(90);
       p.move(300);
       p.setWidth(20);
       p.up();
       p.move(-130,-90);
       p.down();
       p.setDirection(90);
       p.move(val1);
       p.up();
       p.move(20);
       p.drawString("" + val1);
       
       p.up();
       p.move(-80,-90);
       p.down();
       p.setDirection(90);
       p.move(val2);
       p.up();
       p.move(20);
       p.drawString("" + val2);
       
       p.up();
       p.move(-30,-90);
       p.down();
       p.setDirection(90);
       p.move(val3);
       p.up();
       p.move(20);
       p.drawString("" + val3);
       
       p.up();
       p.move(20,-90);
       p.down();
       p.setDirection(90);
       p.move(val4);
       p.up();
       p.move(20);
       p.drawString("" + val4);
       
       
       
    }
    
}

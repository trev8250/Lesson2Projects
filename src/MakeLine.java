import TurtleGraphics.*;
import java.awt.Color;
import hsa.*;



public class MakeLine {

   
    public static void main(String[] args) {
        float x1,x2,y1,y2;
        SketchPadWindow win = new SketchPadWindow(400,400);
      Pen p = new StandardPen(win);
      Console c = new Console();
      while(true){
      c.print("Enter the first X coordinate of your line (0-400) -> ");
      x1 = c.readFloat();
      c.print("Enter the first Y coordinate of your line (0-400) -> ");
      y1 = c.readFloat();
      c.print("Enter the second X coordinate of your line (0-400) -> ");
      x2 = c.readFloat();
      c.print("Enter the second Y coordinate of your line (0-400) -> ");
      y2 = c.readFloat();
      if(x1>=0 && x1<=400 && x2>=0 && x2<=400 && y1>=0 && y1<=400 && y2>=0 && y2<=400) break;
      c.print("Make sure all numbers entered are between 0-400\n");
      }
      p.up();
      p.move(x1-200,y1-200);
      p.down();
      p.drawString("(" + x1+ ", " + y1 + ")");
      p.move(x2-x1, y2-y1);
      p.drawString("(" + x2+ ", " + y2 + ")" );
              
      
    }
    
}

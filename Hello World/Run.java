
/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;

public class Run
{
   public static void main(String[] args)
   {
       LCD.drawString("Program 1", 0, 0);
       Button.waitForAnyPress();
       LCD.clear();
       Motor.A.forward();
       System.out.println("Forward");
       Button.waitForAnyPress();
       Motor.A.backward();
       System.out.println("Backward");
       Button.waitForAnyPress();
       Motor.A.stop();
   }
}

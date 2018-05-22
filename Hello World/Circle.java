
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Trace a square 
 * @author Roger
*/
public class Circle
{
    DifferentialPilot pilot ;
    
    public void  drawCircle(double length)
    {
        while(true == true){
            pilot.steer(length);
        }
    }
    
    public static void main(String[] args)
    {
        Circle sq = new Circle();
        sq.pilot = new DifferentialPilot(56, 160, Motor.A, Motor.B);
        sq.drawCircle(150);
    }
}
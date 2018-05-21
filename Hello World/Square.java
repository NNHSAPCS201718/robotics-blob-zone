import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Trace a square 
 * @author Roger
*/
public class Square
{
    DifferentialPilot pilot ;
    
    public void  drawSquare(float length)
    {
        for(int i = 0; i<4 ; i++)
        {
            pilot.travel(length);
            pilot.rotate(90);                 
        }
    }
    
    public static void main(String[] args)
    {
        Square sq = new Square();
        sq.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.C);
        sq.drawSquare(20);
    }
}
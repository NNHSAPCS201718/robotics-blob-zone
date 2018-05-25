import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Sound;
import java.io.File;

public class TouchS{
  public static void main(String[] args) {
      while( true == true){
      TouchSensor touch = new TouchSensor(SensorPort.S1);
      File file = new File("hadouryu.wav");
      if (touch.isPressed() == true) {
          
          Sound.beep();
          LCD.drawInt(100, 0, 3);
        }
    }
  }
}
import lejos.nxt.*;

public class UltraSonic {
    public static void main(String[] args) {
        UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);

        while (true == true) {
            
            LCD.drawInt(sonic.getDistance(), 0, 3);
        }
  }
}
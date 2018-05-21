  import lejos.nxt.Button;
  import lejos.nxt.LCD;
  import lejos.nxt.Motor;
  import lejos.util.Delay;
  
 public class Run5 {
 
      public static void main(String[] args) {
           LCD.drawString("Progam 5", 0, 0);
           Button.waitForAnyPress();
           LCD.clear();
           int speed = 720;
           Motor.A.setSpeed(speed);
           Motor.B.setSpeed(speed);
           Motor.C.setSpeed(speed);
           Motor.A.forward();
           Motor.B.forward();
           Motor.C.forward();
           for (int i = 0 ; i < 8 ; i++)
           {
                Delay.msDelay(200);
                LCD.drawInt(Motor.A.getTachoCount(), 0,i);
                LCD.drawInt(Motor.B.getTachoCount(), 6,i);
                LCD.drawInt(Motor.A.getTachoCount(), 12,i);
           }
           while(Motor.A.isMoving()|| Motor.B.isMoving()||Motor.C.isMoving());
                Button.waitForAnyPress();
      } 
 }
 
 
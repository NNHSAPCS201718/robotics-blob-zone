import lejos.nxt.*;

public class Light implements SensorPortListener{
    
        public void stateChanged(SensorPort aSource,
                  int aOldValue,
                  int aNewValue)
                  {
                      
                      
                    }
         public void main(String[] args) {
            SensorPort.S1.addSensorPortListener(this);
            

        }
        
  }

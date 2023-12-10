
package xoxprimum;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class XOXprimum {

   
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
     
      XOXinterface xoxinter=new XOXinterface();
      xoxinter.setVisible(true);
      xoxinter.setLocationRelativeTo(null);
    }
    
}

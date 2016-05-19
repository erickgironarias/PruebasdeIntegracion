
package gui02;

import java.awt.FlowLayout;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Gui_sinH {
    
    public Gui_sinH(){
        JFrame jf = new JFrame();
        jf.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        String nombre[]={"juego","video","musica","teledono","usb","maouse","borrador","lapiz","corrector","esfero"};
        
               for (int i = 0; i < nombre.length; i++){
               jf.add(new JLabel(nombre[i]));
    }
     jf.setSize(200,200);//pack();
     jf.setVisible(true);
     jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

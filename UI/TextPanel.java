
package UI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class TextPanel extends RotPanel{
    TextInputPanel entryPanel;
    TextDisplayPanel displayPanel;
    public TextPanel(JTextField display, JTextField entry){
        setLayout(new FlowLayout(FlowLayout.CENTER));

        entryPanel = new TextInputPanel(entry);
        displayPanel = new TextDisplayPanel(display);
        
        setPreferredSize(new Dimension(400,70));
        
        setColor();
        add(entryPanel);
        add(displayPanel);
    }
    public void setColor(){
    	setBackground(light1);
    	entryPanel.setColor();
    	displayPanel.setColor();
    }


}


package UI;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextInputPanel extends RotPanel{
	
    private final int WIDTH = 150;
    private final int HEIGHT = 50;
    JTextField entry;
    JLabel label;
    public TextInputPanel(JTextField entry){
        super();
        setPreferredSize(new Dimension(150, 50));
        
        this.entry = entry;
        label = new JLabel("Input Text Here:");
        
        setColor();
        
        add(label);
        add(this.entry);
    }
    public void setColor(){
    	setBackground(dark1);
    	label.setForeground(lightFont1);
    }
}

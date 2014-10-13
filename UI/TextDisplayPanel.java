
package UI;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextDisplayPanel extends RotPanel{
    
    private final int WIDTH = 150;
    private final int HEIGHT = 50;
    private JTextField display;
    private JLabel label;
    public TextDisplayPanel(JTextField display){
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        this.display = display;
        label = new JLabel("Output");
        
        setColor();
        
        add(label);
        add(this.display);
    }
    public void setColor(){
    	setBackground(dark1);
    	label.setForeground(lightFont1);
    }
}

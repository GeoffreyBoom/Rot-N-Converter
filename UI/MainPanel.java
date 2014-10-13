
package UI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class MainPanel extends RotPanel{
    private final int ROWS = 3;
    private final int COLUMNS = 1;
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    
    public MainPanel(){
        super();
        setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
    
    public void setColor(){}
}

package UI;

import java.awt.Dimension;

public class ContainPanel extends RotPanel {

	public ContainPanel(){
		super();
		setColor();
	}
	
	public ContainPanel(int width, int height){
		super();
		setPreferredSize(new Dimension(width, height));
	}
	
	public void setColor(){}
	


}

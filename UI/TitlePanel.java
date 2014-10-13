package UI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class TitlePanel extends RotPanel{
	private final int ROWS = 3;
	private final int COLUMNS = 1;
	private JLabel convertMode;
	private JLabel rotNum;
	private JLabel title;
	
	public void setConvertMode(String mode){
		convertMode.setText("Current Convert Mode: " + mode);
	}
	
	public void setRotNum(String num){
		rotNum.setText("Current Rot Number: " + num);
	}
	
	public TitlePanel(){
		//setLayout(new GridLayout(ROWS, COLUMNS));
		title = new JLabel("RotN Convert Software.", JLabel.CENTER);
		title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		
		convertMode = new JLabel("Current Convert Mode: Encode.", JLabel.CENTER);
		convertMode.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));

		
		rotNum = new JLabel("Current Rot Number: 13" , JLabel.CENTER);
		rotNum.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));

		setPreferredSize(new Dimension(400,100));
		
		setColor();
		add(title);
		add(convertMode);
		add(rotNum);
	}
	
	public void setColor(){
		setBackground(header);
		convertMode.setForeground(lightFont1);
		rotNum.setForeground(lightFont1);
		title.setForeground(lightFont1);

	}
}

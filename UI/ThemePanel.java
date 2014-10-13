package UI;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import driver.RotN;

public class ThemePanel extends RotPanel{
	JRadioButton dark;
	JRadioButton orange;
	JRadioButton pink;
	JRadioButton random;
	JPanel title = new JPanel();
	JLabel themes = new JLabel("Themes");
	public ThemePanel(RotN driver){
		dark = new JRadioButton("Dark", true);
		orange = new JRadioButton("Orange", false);
		pink = new JRadioButton("Pink", false);
		random = new JRadioButton("Random", false);

		
		ButtonGroup themeButtons = new ButtonGroup();
		
		themeButtons.add(dark);
		themeButtons.add(orange);
		themeButtons.add(pink);
		themeButtons.add(random);
		
		dark.addActionListener(driver);
		orange.addActionListener(driver);
		pink.addActionListener(driver);
		random.addActionListener(driver);
		
		setColor();
		
		title.add(themes);
		title.setPreferredSize(new Dimension(400,20));
		
		add(title);
		
		add(dark);
		add(orange);
		add(pink);
		add(random);
		
		setPreferredSize(new Dimension(400,100));
	}
	public void setColor(){
		setBackground(light1);
		title.setBackground(light1);
		dark.setBackground(dark1);
		orange.setBackground(dark1);
		random.setBackground(dark1);
		themes.setForeground(darkFont1);
		dark.setForeground(lightFont1);
		orange.setForeground(lightFont1);
		random.setForeground(lightFont1);
		pink.setBackground(dark1);
		pink.setForeground(lightFont1);

	}

}

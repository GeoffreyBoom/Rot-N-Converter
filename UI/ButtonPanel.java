package UI;



import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import driver.RotN;


public class ButtonPanel extends RotPanel{
	private JRadioButton encrypt;
	private JRadioButton decrypt;
	private JButton convert;
	private JButton clear;
	private JCheckBox convertNumbers;
	private JComboBox<String> rotSelect;
	
	ContainPanel radioButtons;
	ContainPanel buttons;
	ContainPanel comboButtons;
	ContainPanel numberButton;
	
	public ButtonPanel(RotN driver){
		
			//encrypt decrypt buttons
		encrypt = new JRadioButton("Encrypt", true);
		decrypt = new JRadioButton("Decrypt", false);
		
		encrypt.addActionListener(driver);
		decrypt.addActionListener(driver);
		
		ButtonGroup cryptButtons = new ButtonGroup();
			cryptButtons.add(encrypt);
			cryptButtons.add(decrypt);
		
		
		convert = new JButton("Convert");
		convert.addActionListener(driver);

		
		clear = new JButton("Clear");
		clear.addActionListener(driver);
		
		convertNumbers = new JCheckBox("Convert Numbers?", false);
		convertNumbers.addActionListener(driver);
		
		String[] rotArray = {"ROT5", "ROT7", "ROT13", "ROT17"};
		rotSelect = new JComboBox(rotArray);
		
		rotSelect.setSelectedIndex(2);
		rotSelect.addActionListener(driver);

		//sticking them in panels
		radioButtons = new ContainPanel();
			radioButtons.add(encrypt);
			radioButtons.add(decrypt);
		
		buttons = new ContainPanel();
			buttons.add(convert);
			buttons.add(clear);
		
		comboButtons = new ContainPanel();
			comboButtons.add(rotSelect);
		
		numberButton = new ContainPanel();
			numberButton.add(convertNumbers);
		
		setColor();
		
		setPreferredSize(new Dimension(400,100));
		
		add(radioButtons);
		add(buttons);
		add(comboButtons);
		add(numberButton);
	}
	
	/**
	 * method for setting colors of each element. 
	 */
	public void setColor(){
		setBackground(light1);
		
		encrypt.setBackground(dark1);
		encrypt.setForeground(lightFont1);
		
		decrypt.setBackground(dark1);
		decrypt.setForeground(lightFont1);
		
		convert.setBackground(dark1);
		convert.setForeground(lightFont1);
		
		clear.setBackground(dark1);
		clear.setForeground(lightFont1);
		
		convertNumbers.setBackground(dark1);
		convertNumbers.setForeground(lightFont1);
		
		rotSelect.setBackground(dark1);
		rotSelect.setForeground(lightFont1);
		
		radioButtons.setBackground(medium);
		buttons.setBackground(medium);
		comboButtons.setBackground(medium);
		numberButton.setBackground(medium);
		
		
	}
}

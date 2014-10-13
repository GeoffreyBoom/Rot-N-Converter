//Geoffrey Boom 6640982
//for Comp 249

package driver;

import UI.*;
import converter.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class RotN extends JFrame implements ActionListener{
	
    final int WIDTH = 400;
    final int HEIGHT = 370;
    final int TEXT_SIZE = 10;
    
	private static boolean encodeBool = true;
	private static boolean numbers = false;
	private static int rotNum = 13;
	private static String toConvert;
	private static String converted;
    
    JTextField display;
    JTextField entry;

	/**mainPanel will hold all the sub-panels*/
    MainPanel mainPanel;
    /**titlePanel is a subPanel for all the titles*/
    TitlePanel titlePanel;
    /**buttonPanel holds all the buttons*/
    ButtonPanel buttonPanel;
    /**textPanel is for the text entry and text display*/
    TextPanel textPanel;
    /**holds the buttons to choose a theme for the GUI*/
    ThemePanel themePanel;
    
    
    public RotN(){
        super();
        setTitle("RotN Conversion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Text Fields, to be passed down to TextDisplay, and TextInput
    	display = new JTextField(TEXT_SIZE);
    	entry = new JTextField(TEXT_SIZE);

    	//creating custom panels.
        mainPanel	= new MainPanel();
        titlePanel 	= new TitlePanel();
        textPanel 	= new TextPanel(display, entry);
        buttonPanel = new ButtonPanel(this);
        themePanel = new ThemePanel(this);
        
        //adding subPanels to mainPanel
        mainPanel.add(titlePanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(textPanel);
        mainPanel.add(themePanel);

        add(mainPanel);
        setSize(WIDTH,HEIGHT);

        setResizable(false);

    }
    
	public static void main(String[] args) {
		//start up gui
		RotN runt = new RotN();
        runt.setVisible(true);
	}
	
	public static void setEncodeTrue(){
		encodeBool = true;
	}
	
    public static void setDecodeTrue(){
		encodeBool = false;
	}
    
    public static void setNumbersTrue(){
    	numbers = true;
    }
    
    public static void setNumbersFalse(){
    	numbers = false;
    }
	
	public static String convert(){
		if(encodeBool)
			converted = rotConverter.encode(toConvert, rotNum, numbers);
		else
			converted = rotConverter.decode(toConvert, rotNum, numbers);
		return converted;
	}
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
				
		if (buttonString.equals("Convert")){
	        toConvert = entry.getText();
	        convert();
	        display.setText(converted);
		}
		
		else if (buttonString.equals("Encrypt")){
			titlePanel.setConvertMode("encrypt");
			if(!encodeBool)
				reverseColors();
			setEncodeTrue();
		}
		
		else if (buttonString.equals("Decrypt")){
			titlePanel.setConvertMode("Decrypt");
			if(encodeBool)
				reverseColors();
			setDecodeTrue();
		}
		
		else if (buttonString.equals("Clear")){
			display.setText("");
			entry.setText("");
		}
		
		else if (buttonString.equals("Convert Numbers?")){
			JCheckBox checkBox = (JCheckBox)e.getSource();
			if (checkBox.isSelected())
				setNumbersTrue();
			else if(!checkBox.isSelected())
				setNumbersFalse();
		}
		
		else if (buttonString.equals("Orange")){
			RotPanel.setToOrange();
			if(!encodeBool)
				RotPanel.reverseColors();
			setColor();
		}
		else if (buttonString.equals("Dark")){
			RotPanel.setToDark();
			if(!encodeBool)
				RotPanel.reverseColors();
			setColor();
		}
		else if (buttonString.equals("Pink")){
			RotPanel.setToPink();
			if(!encodeBool)
				RotPanel.reverseColors();
			setColor();
		}
		else if (buttonString.equals("Random")){
			RotPanel.setToRandom();
			setColor();
		}
		
		
		else if (buttonString.equals("comboBoxChanged")){
	        JComboBox comboBox = (JComboBox) e.getSource();
	        String selectedItem = (String)comboBox.getSelectedItem();
	        if(selectedItem.equals("ROT5")){
	        	rotNum = 5;
	        	titlePanel.setRotNum("5");
	        }
	        else if(selectedItem.equals("ROT7")){
	        	rotNum = 7;
	        	titlePanel.setRotNum("7");
	        }
	        else if(selectedItem.equals("ROT13")){
	        	rotNum = 13;
	        	titlePanel.setRotNum("13");
	        }
	        else if(selectedItem.equals("ROT17")){
	        	rotNum = 17;
	        	titlePanel.setRotNum("17");
	        }
		}
	}
	
	public void setColor(){
	    mainPanel.setColor();
	    titlePanel.setColor();
	    buttonPanel.setColor();
	    textPanel.setColor();
	    themePanel.setColor();
	    
	}
	
	public void reverseColors(){
		RotPanel.reverseColors();
		setColor();
	}
	
	/*
	public static void consoleTest(){
		Scanner userIn = new Scanner(System.in);
		userIn.close();
		String input;
		do{
			input = userIn.next();
			if(input.equals("encode")){
				System.out.println("set up for encoding");
				setEncodeTrue();
			}
			if(input.equals("decode")){
				System.out.println("set up for decoding");
				setDecodeTrue();
			}
			if(input.equals("setoffset")){
				System.out.println("what do you want the offset to be?");
				rotNum = userIn.nextInt();
			}
			if(input.equals("convert")){
				System.out.println("what do you want to convert");
				toConvert = userIn.next();
				convert();
				System.out.println(converted);
			}
			
		}while(!(input.equals("stop")));

	}
	*/
}

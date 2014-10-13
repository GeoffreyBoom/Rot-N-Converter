
package UI;

import java.awt.Color;
import javax.swing.*;

public abstract class RotPanel extends JPanel {
	
	private static int random(){
		int inte = (int) Math.round(Math.random() * 250);
		return inte;
	}
	//default, dark theme
    public static Color medium		= new Color(85,85,85);
    
    public static Color light1		= new Color(120,120,120);
    public static Color dark1		= new Color(60,60,60);
    public static Color header		= new Color(80,80,80);
    
    public static Color darkFont1	= new Color(167, 252, 0); 
    public static Color lightFont1	= new Color(167, 252, 0);
	
    public RotPanel(){
    	super();
    }
    public RotPanel(Color color){
    	setBackground(color);
    }
    public RotPanel(Color color, int width, int height){
    	super();
    	setBackground(color);
    	setSize(width, height);
    }
    
    public static void setToRandom(){
    	medium		= new Color(random(),random(),random());
        
        light1		= new Color(random(),random(),random());
        dark1		= new Color(random(),random(),random());
        header		= new Color(random(),random(),random());
        
        darkFont1	= new Color(random(),random(),random()); 
        lightFont1	= new Color(random(),random(),random());
    }
    
    public static void setToPink(){
    	medium		= new Color(240,240,240);
        
        light1		= new Color(255,255,255);
        dark1		= new Color(0xFFb3d8);
        header		= new Color(0xFF34b3);
        
        darkFont1	= new Color(0,0,0); 
        lightFont1	= new Color(255,255,255);
    }
    
    public static void setToOrange(){
    	medium		= new Color(240,240,240);
        
        light1		= new Color(255,255,255);
        dark1		= new Color(180,180,180);
        header		= new Color(0xffaa00);
        
        darkFont1	= new Color(0,0,0); 
        lightFont1	= new Color(255,255,255);
    }
    
    public static void setToDark(){
    	medium		= new Color(85,85,85);
        
        light1		= new Color(120,120,120);
        dark1		= new Color(60,60,60);
        header		= new Color(80,80,80);
        
        darkFont1	= new Color(167, 252, 0); 
        lightFont1	= new Color(167, 252, 0);
    }
    
    //method for setting the color
    public abstract void setColor();
    
    public static void reverseColors(){
    	Color temp;
    	
    	temp = light1;
    	light1 = dark1;
    	dark1 = temp;
    	
    	temp = darkFont1;
    	darkFont1 = lightFont1;
    	lightFont1 = temp;

    }
}

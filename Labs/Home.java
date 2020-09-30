import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Home {

	public static void main(String[] args) {
		JFrame a = new JFrame(); 
	    int width = 500, height = 500; 
	    a.setVisible(true); 
	    a.setSize(width+20, height+40); 
	    a.getContentPane().setBackground(Color.green);
	    
	    House b = new House(width, height); 
	    a.add(b);
		

	}

}

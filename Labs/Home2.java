import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics; 

public class Home2 extends JComponent {

	public static void main(String[] args) {
	    JFrame frame = new JFrame(); 
	    frame.setVisible(true); 
	    int width = 500, height = 500;
	    frame.setSize(width + 20, height + 40); 
	    Home2 drawing = new Home2(width, height); 
	    frame.add(drawing);     
	  }
	  int width, height; 
	  House2 a, b, c; 
	  public Home2(int width, int height) {
	    this.width = width;
	    this.height = height;
	    
	    a = new House2( 20,  50, 0.3);         
	    b = new House2(220,  20, 0.5);         
	    c = new House2( 40, 230, 0.4);         
	  }
	  public void paintComponent(Graphics g) {
	    a.draw(g); 
	    b.draw(g); 
	    c.draw(g); 
	  }

}

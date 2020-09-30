import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;


public class House extends JComponent {
	int width, height; 
	public House(int width, int height) {
		this.width = width;
	    this.height = height; 
	  }
	
	public void paintComponent(Graphics g) {
	    
	    int left = 5;
	    g.fillRect( 50-left,  50, 435, 480); // House outline                                [ 1] 
	    g.setColor(new Color(220, 220, 220)); 
	    
	    g.fillRect(120-left, 390, 95, 70); // window                        [ 2] 
	    g.setColor(Color.WHITE); 
	    
	    g.fillRect(245-left, 375, 60, 150); // Door                       [ 3] 
	    g.setColor(new Color(240, 200, 40)); // some gold 
	    
	    g.fillRect( 335-left, 390, 95,  70); // right window (left)                   [ 4] 
	    g.setColor(new Color(240, 200, 40)); 
	    
	    g.fillRect(335-left, 130, 95,  70); // left upstairs window (right)                   [ 5] 
	    g.setColor(new Color(255, 255, 255)); 
	    
	    g.fillRect(120-left,  130,  95, 70); // right upstairs window (left)                    [ 6] 
	    g.setColor(new Color(255, 255, 255)); 
	    
	    g.fillRect(50-left, 255, 435,  1); // House/floor divider                     [ 7] 
	    g.setColor(Color.BLACK);  
	    
	    g.fillOval(250-left, 445,  5,  10); // door handle              [ 8] 
	    
	    g.setColor(Color.blue); // blue as window shade
	    g.fillRect(335-left, 130,  30,  70); // left upstairs window shade (left)              [ 9] 
	    
	    g.fillRect(415-left, 130,  30,  70); // left upstairs window shade (right)
	    
	    g.fillRect(120-left, 130,  30,  70); // right upstairs window shade (left)              [ 9] 
	    
	    g.fillRect(200-left, 130,  30,  70); // right upstairs window shade (right)
	    g.setColor(Color.black);
	    g.fillPolygon( new Polygon // Roof                                 [11] 
                ( new int[] { 45, 250, 485 }, 
                  new int[] { 95, 20, 95 }, 
                  3
                )
             );
	    
	  }
	

	

}

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class House2 {
	int x, y; 
	  double scale; 
	  public House2(int x, int y, double scale) {
	    this.x = x; 
	    this.y = y; 
	    this.scale = scale; 
	  }
	  private int scale(int size) {
	    return (int)(this.scale * size); 
	  }
	  public void draw(Graphics g) {
//	    g.setColor(Color.WHITE); 
//	    g.fillRect(x +  0, y +  0, scale(500), scale(500)); 
//	    g.setColor(Color.BLACK); 
//	    g.drawRect(x +  0, y +  0, scale(500), scale(500)); 
	    
	    g.setColor(Color.black);
	    g.fillPolygon( new Polygon // Roof                                 [11] 
                ( new int[] { x + scale(45), x + scale(250), x + scale(485) }, 
                  new int[] { y + scale(95), y + scale(20), y + scale(95) }, 
                  3
                )
             );
	    
	    int left = 5;
	    g.fillRect(x + scale( 50-left), y + scale( 50), scale(435), scale(480)); 
	    g.setColor(new Color(220, 220, 220)); 
	    
	    g.fillRect(x + scale(120-left), y + scale(390), scale(95), scale(70)); 
	    g.setColor(Color.WHITE); 
	    
	    g.fillRect(x + scale(245-left), y + scale(375), scale(60), scale(150)); 
	    g.setColor(new Color(240, 200, 40)); 
	    
	    g.fillRect(x + scale( 335-left), y + scale(390), scale(95), scale( 70)); 
	    g.setColor(new Color(240, 200, 40)); 
	    
	    g.fillRect(x + scale(335-left), y + scale(130), scale(95), scale( 70)); 
	    g.setColor(new Color(255, 255, 255)); 
	    
	    g.fillRect(x + scale(120-left), y + scale( 130), scale( 95), scale(70)); 
	    g.setColor(new Color(255, 255, 255)); 
	    
	    g.fillRect(x + scale(50-left), y + scale( 255), scale(435), scale(1)); 
	    g.setColor(Color.BLACK);  
	    
	    g.fillRect(x + scale(230-left), y + scale(120), scale( 25), scale( 33)); 
	    g.fillRect(x + scale(270-left), y + scale(124), scale( 17), scale( 23)); 
	    g.setColor(new Color(240, 200, 40));
	    
	    g.fillOval(x + scale(250-left), y + scale(445),  scale(5),  scale(10)); // door handle              [ 8] 
	    
	    g.setColor(Color.blue); // blue as window shade
	    g.fillRect(x + scale(335-left), y + scale(130),  scale(30),  scale(70)); // left upstairs window shade (left)              [ 9] 
	    
	    g.fillRect(x + scale(415-left), y + scale(130),  scale(30),  scale(70)); // left upstairs window shade (right)
	    
	    g.fillRect(x+ scale(120-left), y + scale(130),  scale(30),  scale(70)); // right upstairs window shade (left)              [ 9] 
	    
	    g.fillRect(x + scale(200-left), y + scale(130),  scale(30),  scale(70)); // right upstairs window shade (right)
	    
	    

	  }

}

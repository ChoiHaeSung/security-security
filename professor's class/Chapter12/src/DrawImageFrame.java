import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawImageFrame extends JFrame{
	Image img;
	public DrawImageFrame() {
	ImageIcon icon = new ImageIcon("d://car.jpg");
		img = icon.getImage();
		setSize(500,200);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawImageFrame f = new DrawImageFrame();
	}
}

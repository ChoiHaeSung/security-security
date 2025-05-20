import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MinePanel extends JPanel implements ActionListener {
	int light_number=0;
	public MinePanel() {
			setLayout(new BorderLayout()) {
			JButton b = new JButton("신호 변경");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);
		}
		protected void paintComponent(Graphics g) {
			// 신호등을 그린다
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drwaOval(100, 10, 100,100);
			g.drwaOval(200, 10, 100,100);
			g.drwaOval(300, 10, 100,100);
			
			if(light_number==0) {
				g.setColor(Color.RED);
				g.fillOval(100, 10, 100, 100);

			}else if(light_number==1) {
				g.setColor(Color.YELLOW);
				g.fillOval(200, 10, 100, 100);

			}else(light_number) {
				g.setColor(Color.GREEN);
				g.fillOval(300, 10, 100, 100);
			}
		}
		public void actionPerformed(ActionEvent arg0) {
			if (++light_number >= 3)
				light_number = 0;
			repaint();
		}
	}
}
public class MineFrame extends JFrame{
	public MineFrame() {
			add(new MineFanel);
			setSize(600,200);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MineFrame();

	}

}

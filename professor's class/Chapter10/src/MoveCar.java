import java.awt.event.*;
import javax.swing.*;

public class MoveCar extends JFrame {
    int img_x = 150, img_y = 150;
    JButton button;

    public MoveCar() {
        setSize(600, 300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("d:\\car.png.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x, img_y);
        button.setSize(200, 100);
        panel.add(button);
        
        panel.setFocusable(true); // panel이 키 이벤트를 받을 수 있도록 설정
        panel.requestFocusInWindow(); // 포커스 요청

        panel.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                button.setLocation(img_x, img_y);
            }
            public void mouseReleased(MouseEvent e) {	}
            public void mouseEntered(MouseEvent e) {	}
            public void mouseExited(MouseEvent e) {	}
            public void mouseClicked(MouseEvent e) {	}
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MoveCar f = new MoveCar();
    }
}

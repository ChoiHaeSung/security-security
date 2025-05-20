import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

 

class MyPanel extends JPanel implements ActionListener{

int light_number=0;

public MyPanel() {

setLayout(new BorderLayout());

JButton b= new JButton("신호등");

b.addActionListener(this);

add(b,BorderLayout.SOUTH);

}

protected void paintComponent(Graphics g) {

super.paintComponent(g);

g.setColor(Color.BLACK);

g.drawOval(100, 10, 100, 100);

g.drawOval(200, 10, 100, 100);

g.drawOval(300, 10, 100, 100);

 

if(light_number==0) {

g.setColor(Color.RED);

g.fillOval(100, 10, 100, 100);

}else if(light_number==1) {

g.setColor(Color.YELLOW);

g.fillOval(200, 10, 100, 100);

}else {

g.setColor(Color.GREEN);

g.fillOval(300, 10, 100, 100);

}

}

public void actionPerformed(ActionEvent e) {

if(++light_number>=3)

light_number=0;

repaint();

}

}

public class MyFrame extends JFrame {

public MyFrame() {

add(new MyPanel());

setSize(600,200);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main(String[] arg) {

new MyFrame();

}

 

}
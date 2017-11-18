import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx extends JFrame {
	public MouseEventEx() {
		setTitle("마우스 올리기 내리기");	// 창 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 라벨 추가
		
		label.addMouseListener(new MouseAdapter() {  // 이벤트 지정 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});

		setSize(250,150); // 창 크기 지정 
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new MouseEventEx();
	}
}

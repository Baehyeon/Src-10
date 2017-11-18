import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftEventEx extends JFrame {
	public LeftEventEx() {
		setTitle("Left 키 사용");	// 창 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 라벨 추가
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {	// LEFT 키를 누르면 
					JLabel la = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(la.getText());
					la.setText(text.reverse().toString()); // 라벨의 이름 반대로 출력
				}
			}
		});
		c.add(label);
		
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	
	static public void main(String [] args) {
		new LeftEventEx();
	}
}

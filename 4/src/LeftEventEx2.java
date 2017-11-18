import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftEventEx extends JFrame {
	JLabel label;
	String LoveJava;
	
	public LeftEventEx() {
		setTitle("Left 키 사용");	// 창 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		LoveJava = "Love Java";
		JLabel label = new JLabel("LoveJava");
		c.add(label); // 라벨 추가

		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {	// LEFT 키를 누르면 
					String moveString = LoveJava.substring(1) + LoveJava.substring(0, 1);
				    LoveJava = new String(moveString);
				    label.setText(moveString);
				}
			}
		});
		c.add(label);
		
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 설정
	}
	
	static public void main(String [] args) {
		new LeftEventEx();
	}
}

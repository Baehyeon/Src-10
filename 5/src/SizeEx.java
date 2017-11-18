import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SizeEx extends JFrame {
	public SizeEx() {
		setTitle("+, -키로 폰트 크기 조절");	// 창 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial 폰트로 10 픽셀 크기
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {	// + 키를 눌렀을 때 이벤트
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') { // - 키를 눌렀을 때 이벤트
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5) // 폰트 크기 5까지 제한 
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 설정
	}
	
	static public void main(String [] args) {
		new SizeEx();
	}
}
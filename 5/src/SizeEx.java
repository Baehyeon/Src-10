import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SizeEx extends JFrame {
	public SizeEx() {
		setTitle("+, -Ű�� ��Ʈ ũ�� ����");	// â �̸�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial ��Ʈ�� 10 �ȼ� ũ��
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {	// + Ű�� ������ �� �̺�Ʈ
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') { // - Ű�� ������ �� �̺�Ʈ
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5) // ��Ʈ ũ�� 5���� ���� 
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ����
	}
	
	static public void main(String [] args) {
		new SizeEx();
	}
}
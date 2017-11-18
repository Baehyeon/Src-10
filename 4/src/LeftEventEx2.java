import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftEventEx extends JFrame {
	JLabel label;
	String LoveJava;
	
	public LeftEventEx() {
		setTitle("Left Ű ���");	// â �̸�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		LoveJava = "Love Java";
		JLabel label = new JLabel("LoveJava");
		c.add(label); // �� �߰�

		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {	// LEFT Ű�� ������ 
					String moveString = LoveJava.substring(1) + LoveJava.substring(0, 1);
				    LoveJava = new String(moveString);
				    label.setText(moveString);
				}
			}
		});
		c.add(label);
		
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺��� Ű �Է� ��Ŀ�� ����
	}
	
	static public void main(String [] args) {
		new LeftEventEx();
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx extends JFrame {
	public MouseEventEx() {
		setTitle("���콺 �ø��� ������");	// â �̸�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // �� �߰�
		
		label.addMouseListener(new MouseAdapter() {  // �̺�Ʈ ���� 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});

		setSize(250,150); // â ũ�� ���� 
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new MouseEventEx();
	}
}

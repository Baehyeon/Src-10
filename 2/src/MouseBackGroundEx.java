import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseBackGroundEx extends JFrame {
	JPanel contentPane = new JPanel();
 
	public MouseBackGroundEx() {
 		setTitle("�巡�뵿�� ���� �ٲ�");
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		setContentPane(contentPane);
 		contentPane.setBackground(Color.GREEN);	// �ʱ� ���� �ʷϻ�
 		
 		contentPane.addMouseMotionListener(new MouseMotionAdapter() {	// ���콺 ��� �̺�Ʈ
 			public void mouseDragged(MouseEvent e) {
 				contentPane.setBackground(Color.YELLOW); // �巡�뵿�� ���� �����
 			}
 			public void mouseMoved(MouseEvent e) {
 				contentPane.setBackground(Color.GREEN);	// �����̸� ���� �ʷϻ�
 			}
 	});
 	
 	setSize(300, 200);
 	setVisible(true);
 }
 	
 	public static void main(String[] args) {
 		new MouseBackGroundEx();
 	}
}

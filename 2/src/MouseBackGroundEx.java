import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseBackGroundEx extends JFrame {
	JPanel contentPane = new JPanel();
 
	public MouseBackGroundEx() {
 		setTitle("드래깅동안 배경색 바꿈");
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		setContentPane(contentPane);
 		contentPane.setBackground(Color.GREEN);	// 초기 배경색 초록색
 		
 		contentPane.addMouseMotionListener(new MouseMotionAdapter() {	// 마우스 모션 이벤트
 			public void mouseDragged(MouseEvent e) {
 				contentPane.setBackground(Color.YELLOW); // 드래깅동안 배경색 노란색
 			}
 			public void mouseMoved(MouseEvent e) {
 				contentPane.setBackground(Color.GREEN);	// 움직이면 배경색 초록색
 			}
 	});
 	
 	setSize(300, 200);
 	setVisible(true);
 }
 	
 	public static void main(String[] args) {
 		new MouseBackGroundEx();
 	}
}

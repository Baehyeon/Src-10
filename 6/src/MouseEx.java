import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  

public class MouseEx extends JFrame{  
	JLabel text = new JLabel("C");  
	Container c = getContentPane();  
	
	public MouseEx() {  
		setTitle("Random click");	// 창 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		c.setLayout(null);  
		MyMouseListener mouse = new MyMouseListener(); 
		
		text.addMouseListener(mouse);  
		text.setLocation(100, 100); // 초기 위치  
		text.setSize(30, 30);  
		
		add(text);  
		
		setSize(400, 400);  // 창 크기 지정 
		setVisible(true);  
		
		text.requestFocus();  // 텍스트에 키 입력 포커스 설정
   }  
	
	public static void main(String[] args) {  
		new MouseEx();  
   }  
}  

class MyMouseListener extends MouseAdapter{  // 이벤트 소스
	public void mouseClicked(MouseEvent e){  
		JLabel g = (JLabel)e.getSource();  
		int x = (int)(Math.random() * 350);  // 랜덤한 위치 설정 위해 랜덤값 지정 
		int y = (int)(Math.random() * 350);  
		g.setLocation(x,y);  
   }  
}  
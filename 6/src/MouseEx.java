import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  

public class MouseEx extends JFrame{  
	JLabel text = new JLabel("C");  
	Container c = getContentPane();  
	
	public MouseEx() {  
		setTitle("Random click");	// â �̸�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		c.setLayout(null);  
		MyMouseListener mouse = new MyMouseListener(); 
		
		text.addMouseListener(mouse);  
		text.setLocation(100, 100); // �ʱ� ��ġ  
		text.setSize(30, 30);  
		
		add(text);  
		
		setSize(400, 400);  // â ũ�� ���� 
		setVisible(true);  
		
		text.requestFocus();  // �ؽ�Ʈ�� Ű �Է� ��Ŀ�� ����
   }  
	
	public static void main(String[] args) {  
		new MouseEx();  
   }  
}  

class MyMouseListener extends MouseAdapter{  // �̺�Ʈ �ҽ�
	public void mouseClicked(MouseEvent e){  
		JLabel g = (JLabel)e.getSource();  
		int x = (int)(Math.random() * 350);  // ������ ��ġ ���� ���� ������ ���� 
		int y = (int)(Math.random() * 350);  
		g.setLocation(x,y);  
   }  
}  
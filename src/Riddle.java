import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements MouseListener {
	JFrame frame = new JFrame("Riddle!");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton submit = new JButton("Submit");
	JButton hint = new JButton("Hint");
	JTextField output = new JTextField();
	
	public static void main(String[] args) {
		Riddle riddle = new Riddle();
		riddle.setup();
	}
	
	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(label);
		panel.add(submit);
		panel.add(hint);
		panel.add(output);
		
		submit.addMouseListener(this);
		hint.addMouseListener(this);
		
		label.setText("A boy was at a carnival and went to a booth where a man said to the boy, \"If I write your exact weight on this piece of paper then you have to give me $50, but if I cannot, I will pay you $50.\" The boy looked around and saw no scale so he agrees, thinking no matter what the carny writes he'll just say he weighs more or less. In the end the boy ended up paying the man $50. What did the man write?");
		
		frame.setPreferredSize(new Dimension (500, 500));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*Q: A boy was at a carnival and went to a booth 
	*where a man said to the boy, "If I write your 
	*exact weight on this piece of paper then you 
	*have to give me $50, but if I cannot, I will 
	*pay you $50." The boy looked around and saw 
	*no scale so he agrees, thinking no matter what 
	*the carny writes he'll just say he weighs 
	*more or less. In the end the boy ended up paying 
	*the man $50. What did the man write?
	*A: "Your exact weight"
	*H: He wrote exactly what he said he would
	*/
}

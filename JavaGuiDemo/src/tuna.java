import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tuna extends JFrame{
	
	private JButton BMI;
	private JButton fshi;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	
	
	
	public tuna() {
		super("GUISHembull");
		setLayout(new FlowLayout());
		
		text1 = new JTextField("Gjatesia");
		text2= new JTextField("Pesha");
		text3= new JTextField(20);
		text3.setEditable(false);
		BMI = new JButton("BMI");
		fshi = new JButton("Fshi");
		add(text1);
		add(text2);
		add(text3);
		add(BMI);
		add(fshi);
		thehandler handler = new thehandler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		BMI.addActionListener(handler);
		fshi.addActionListener(handler);
	}
		public class thehandler implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				String string = text1.getText();
				String string2=text2.getText();
				
				if(event.getSource()==BMI) {
					if(string2.equals("0")) {
						text3.setText("Smund te gjejme bmi kur pesha =0");
					}
					else {
					text3.setText("Bmi juaj eshte e = me " + Double.parseDouble(string)/Double.parseDouble(string2));
					}
				}
				 if (event.getSource()==fshi) {
						text1.setText("");
						text2.setText("");
						text3.setText("");
					}
		}
		
		
	}
	
	public static void main (String[]args) {
		 
		tuna meme = new tuna();
		meme.setSize(300,300);
		meme.setVisible(true);
		meme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
}}
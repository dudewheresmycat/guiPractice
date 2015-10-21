package distanceConverter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterGUI extends Frame implements ActionListener{
	
	private Label label1;   
	private Label label2;  
	private TextField text1; 
	private TextField text2; 
	private Button button1;
	private Label label1p2;   
	private Label label2p2;  
	private TextField text1p2; 
	private TextField text2p2; 
	private Button button1p2;
	private static final int CENTER = 1;
	public static final float CENTER_ALIGNMENT = 0.5f;
	   
	public ConverterGUI(){
		setLayout(new FlowLayout(CENTER));
		
		
		//text label
		label1 = new Label("Enter a distance in kilometers");
		add(label1);
		//input box
		text1 = new TextField("0",10);
		text1.setEditable(true);
		add(text1);
		//button w/ listener
		button1 = new Button("Click here to convert");
		add(button1);
		ActionListener first = this;
		button1.addActionListener(first);
		//text 2 label
		label2 = new Label("Output in miles");
		add(label2);
		text2 = new TextField("0",10);
		text2.setEditable(false);
		add(text2);
		label1p2 = new Label("Enter a distance in miles");
		add(label1p2);
		//input box
		text1p2 = new TextField("0",10);
		text1p2.setEditable(true);
		add(text1p2);
		//button w/ listener
		button1p2 = new Button("Click here to convert");
		button1p2.setActionCommand("toKilometers");
		add(button1p2);
		ActionListener second = this;
		button1p2.addActionListener(second);
		//text 2 label
		label2p2 = new Label("Output in kilometers");
		add(label2p2);
		text2p2 = new TextField("0",10);
		text2p2.setEditable(false);
		add(text2p2);
		// pane main size
		setTitle("Converter Pane");
	    setSize(500, 300);
		//visible
		setVisible(true); 
		
		
	}

	public void actionPerformed(ActionEvent first) {
		if (first.getActionCommand().equals("toKilometers")) {
			double miles = Double.parseDouble(text1p2.getText());
			double kilometers = miles / 0.62137119;
			String returnText = "" + kilometers;
			text2p2.setText(returnText);

		} else {
			double kilometers = Double.parseDouble(text1.getText());
			double miles = kilometers * 0.62137119;
			String returnText = "" + miles;
			text2.setText(returnText);
		}

	}
	/*
	public void actionPerformed(ActionEvent second) {
		
	}
	*/
	
}

package demoproject;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;

public class awt1 {

	public static void main(String[] args) {
		Frame frame = new Frame ("Demo Project");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1000,1000);
		
		Button button = new Button("Submit");
		Label label = new Label("Username");
		TextField text =  new TextField();
		frame.add(text);
		frame.add(label);
		frame.add(button);
		button.setBounds(500,500,100,50);
		text.setBounds(200,100,500,200);

	}

}

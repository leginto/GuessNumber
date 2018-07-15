package in.leginto.guessnumber.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class GuessNumber implements EntryPoint {
	public void onModuleLoad() {
		
		
		final TextBox textBox = new TextBox();
		final Button btn = new Button("Submit");
		final Label lb = new Label("Enter your Name!");
		
		
		
		RootPanel.get("div4").add(lb);
		RootPanel.get("div2").add(textBox);
		RootPanel.get("div3").add(btn);
		
		String name = textBox.getValue();
		
		
		final Button btn2 = new Button("Submit");
		
		RootPanel.get("div3").add(btn2);
		
		btn2.setVisible(false);
		
		
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				textBox.setVisible(false);
				
				btn.setEnabled(false);
				lb.setText("Imagine a number between 0 and 10");
				
				
				btn.setVisible(false);
				btn2.setVisible(true);
				
				
			}
		});
		
		
		
		final Button btn3 = new Button("Submit");
		
		RootPanel.get("div3").add(btn3);
		
		btn3.setVisible(false);
		
		
		
		btn2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn2.setEnabled(false);
				lb.setText("Double the imagined number");
				
				
				btn2.setVisible(false);
				
				btn3.setVisible(true);
				
				
			}
		});
		
		
		
		
		
		final Button btn4 = new Button("Submit");
		
		RootPanel.get("div3").add(btn4);
		
		btn4.setVisible(false);
		
		
		
		btn3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn3.setEnabled(false);
				lb.setText("Add 40 to the result");
				
				
				btn3.setVisible(false);
				
				btn4.setVisible(true);
				
				
			}
		});
		
		
		

		final Button btn5 = new Button("Submit");
		
		RootPanel.get("div3").add(btn5);
		
		btn5.setVisible(false);
		
		
		
		btn4.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn4.setEnabled(false);
				lb.setText("Half the result");
				
				
				btn4.setVisible(false);
				
				btn5.setVisible(true);
				
				
			}
		});
		
		
		
		
		final Button btn6 = new Button("Submit");
		
		RootPanel.get("div3").add(btn6);
		
		btn6.setVisible(false);
		
		
		
		btn5.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn5.setEnabled(false);
				lb.setText("Subtract the original guessed number from the result");
				
				
				btn5.setVisible(false);
				
				btn6.setVisible(true);
				
				
			}
		});
		
		//String last = "Hey! ";//+name+". Your answer is ";
		
		
		btn6.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn6.setEnabled(false);
				lb.setVisible(false);
				
				
				btn6.setVisible(false);
				
				//btn6.setVisible(true);
				
				
			}
		});
		
		
		
		
		
		
		
	}
}

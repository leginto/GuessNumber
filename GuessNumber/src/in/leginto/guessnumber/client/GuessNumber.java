package in.leginto.guessnumber.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


public class GuessNumber implements EntryPoint {
	
	@Override
	public void onModuleLoad() {
		
		
		//final TextBox textBox = new TextBox();
		final Button btn = new Button("Proceed");
		final Label lb = new Label();
		
		
		
		RootPanel.get("div4").add(lb);
		//RootPanel.get("div2").add(textBox);
		RootPanel.get("div3").add(btn);
		
		//final String name = textBox.getText().toString();
		final int res = 10+((int)(Math.random()*10))*4;
		final int assume = 10+((int)(Math.random()*10))*2;
		
		lb.setText("Press \"Proceed\" to play a game.");
		
		
		final Button btn2 = new Button("Proceed");
		
		RootPanel.get("div3").add(btn2);
		
		btn2.setVisible(false);
		
		
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
				btn.setEnabled(false);
				lb.setText("Imagine a number between 0 and "+assume);
				
				
				btn.setVisible(false);
				btn2.setVisible(true);
				
				
			}
		});
		
		
		
		final Button btn3 = new Button("Proceed");
		
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
		
		
		
		
		
		final Button btn4 = new Button("Proceed");
		
		RootPanel.get("div3").add(btn4);
		
		btn4.setVisible(false);
		
		
		
		btn3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				btn3.setEnabled(false);
				lb.setText("Add "+res+" to the result");
				
				
				btn3.setVisible(false);
				
				btn4.setVisible(true);
				
				
			}
		});
		
		
		

		final Button btn5 = new Button("Proceed");
		
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
		
		
		
		
		final Button btn6 = new Button("Proceed");
		
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
		
		
		final Button btn7 = new Button("Retry");
		
		RootPanel.get("div3").add(btn7);
		
		btn7.setVisible(false);
		
		
		
		btn6.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				//btn6.setEnabled(false);
				btn6.setVisible(false);
				
				lb.setText("Your final answer is "+res/2);
				//lb.setVisible(false);
				btn7.setVisible(true);
				
				
				
				
			}
		});
		
		
		btn7.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
				btn7.setVisible(false);
				
				lb.setText("This key dont work, reload the page");
				
				
				
				
			}
		});
		
		
		
		
		
		
	}
}

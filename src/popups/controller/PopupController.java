package popups.controller;

import popups.view.PopupViewer;

public class PopupController
{
	
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			
		display.displayMessage("hi there");
		
		answer = display.collectResponse("what is going on?");
		display.displayMessage(answer + " is what you said");
		
		}
	
	}

}

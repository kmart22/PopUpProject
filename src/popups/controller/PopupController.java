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
	
	
	/**
	 * checks if the supplied string can be parsed to a double value.
	 * @param potentialValue the string to test
	 * @return whether the value could be parsed; true f it can be parsed, false otherwise
	 */
	private boolean isDouble(String potentialValue)
	{
		      boolean isParseable = false;
		      
		      try
		      {
		    	  double test = Double.parseDouble(potentialValue);
		    	  isParseable = true;
		      }
		      catch(NumberFormatException notDouble)
		      {
		    	  display.displayMessage("this is not a double value =:<");
		      }
		      return isParseable;
	}
}

package popups.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;
public class PopupController
{
	
	private PopupViewer display;
	
	private List<Thingy> thingyList;
	
	public PopupController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	}
	
	public void start()
	{
		learnLists();
//		String answer = "sample";
//		while(answer != null && !isDouble(answer))
//		{
//			answer = display.collectResponse("you need to type in a number!!!");
//		}
//	
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
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time");
		}
		
		
		return isParseable;
	}
	
	private void learnLists()
	{
		display.displayMessage(thingyList.size() + " is the size of the list.");
		Thingy testThingy = new Thingy ();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + " is the size of the list");
		
		for (int index = 0; index < 5; index++)
		{
			Thingy addThingy = new Thingy();
			thingyList.add(addThingy);
			display.displayMessage(addThingy.getWords());
		}
		///////	
		display.displayMessage(thingyList.size() + "is the size");
		
		thingyList.get(3).setWords("look i changed a value");
		Thingy temp = thingyList.get(4);
		temp.setWords("stuff");
		
		for ( int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		/////////
		thingyList.add(3, new Thingy());
		
		thingyList.remove(0); //I no longer have access to this object because there is no = sign
		
		display.displayMessage("the size is " + thingyList.size());
		
		Thingy deletedThingy = thingyList.remove(3);
		display.displayMessage(deletedThingy.getWords() + " and the list size is" + thingyList.size());
		
		thingyList.set(0, deletedThingy);
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		
		for (Thingy currentThingy : thingyList)
		{
			display.displayMessage(currentThingy.getWords());
		}
		
	}
	
}

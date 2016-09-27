package popups.view;

import javax.swing.JOptionPane;

public class PopupViewer
{
	/**
	 * Makes a popup window to display the supplied message.
	 * @param message the message to be placed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * creates an input popup to collect a response from the user as a string .
	 * @param question the question being asked to the user.
	 * @return the users response
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
				
		return response;
	}
}

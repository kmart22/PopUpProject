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
}
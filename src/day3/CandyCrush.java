package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String ans1= JOptionPane.showInputDialog("What is a person that you don't like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "Using my super computer advanced algorithm patterns, I can mathamatically confirm that you are in love with "+ ans1);
		// 3. Ask the user for the name of their best friend
		String ans2= JOptionPane.showInputDialog("What is the name of your best friend?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, ans2+" Is the name of the guy that I will destroy tommorow. The only way to save him is to make out with " + ans1);
		

	} 
}




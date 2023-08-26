package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		int userAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
		if(userAge>18 && userAge<75) {
			JOptionPane.showInputDialog("who do you think the next president should be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "your opinion is invalid.");
		}
	}
} 

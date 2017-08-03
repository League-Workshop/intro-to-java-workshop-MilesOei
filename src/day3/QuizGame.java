package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome to my quiz game! \nAnswer the questions correctly and you get a point.");
		
		String first = JOptionPane.showInputDialog("What is 13+15?");
		
		if (first.equals("28")) {
			JOptionPane.showMessageDialog(null, "You are correct! \nNext Question...");			
		score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. \nNext Question...");
		}

		
		String second = JOptionPane.showInputDialog("Who was the first president?");
		
		if (second.equalsIgnoreCase("George Washington")) {
			JOptionPane.showMessageDialog(null, "You are correct! \nNext Question...");			
		score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. \nNext Question...");
		}

			
		String third = JOptionPane.showInputDialog("What question is this?");
		
		if (third.equals("3")) {
			JOptionPane.showMessageDialog(null, "You are correct! \nNext Question...");			
		score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. \nNext Question...");
		}

		
	String fourth = JOptionPane.showInputDialog("How do you say Hello in Spanish?");
		
		if (fourth.equalsIgnoreCase("Hola")) {
			JOptionPane.showMessageDialog(null, "You are correct! \nNext Question...");			
		score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. \nNext Question...");
		}

		
	String fifth = JOptionPane.showInputDialog("Fill in the blank \nNeil Armstrong was the first man on the ____.");
		
		if (fifth.equalsIgnoreCase("Moon")) {
			JOptionPane.showMessageDialog(null, "You are correct! \n\n Your score is " + score + "\nThanks for playing!");			
		score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. \n\n Your score is " + score + "\nThanks for playing!...");
		}

		
		
	}
}

package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {

	void scaryPopUp() {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer :0!");
	}

	static void testPositive(int i) throws NegativeNumberException {
		if (i < 0) {
			throw new NegativeNumberException();
		}
	}

	public static void main(String[] args) {
		try {
			testPositive(2);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.scaryPopUp();
		} finally{
			JOptionPane.showMessageDialog(null, "Don't worry, your computer is okay!");
		}
	}
}

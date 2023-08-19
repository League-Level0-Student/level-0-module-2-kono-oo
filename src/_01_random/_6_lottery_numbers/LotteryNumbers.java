//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random ran = new Random();
		String numbers = "";
		for (int i = 0; i < 6; i++) {
			int ranNum = ran.nextInt(70);
			numbers += ranNum;
			numbers += " ";
		}
		JOptionPane.showMessageDialog(null, numbers, "Lottery Ticket",  0);
		}
	}


package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
int one = ran.nextInt(99 - 1 + 1) + 1;
int two = ran.nextInt(99 - 1 + 1) + 1;
int three = ran.nextInt(99 - 1 + 1) + 1;
int four = ran.nextInt(99 - 1 + 1) + 1;
JOptionPane.showMessageDialog(null, "this is your lottery, or raffle ticket,");
JOptionPane.showMessageDialog(null,  one + " " + two + " " + three + " " + four );
 	

}
	}


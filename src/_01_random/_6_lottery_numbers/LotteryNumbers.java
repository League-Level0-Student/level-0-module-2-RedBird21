package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
int randomLotteryTicket = ran.nextInt(99 - 1 + 1) + 1;

int lala = randomLotteryTicket;
JOptionPane.showMessageDialog(null, lala); 	
}
	}


//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	static boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		
		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/			 
			
		/* 2. Make it so that the user can keep entering new animals. */
		
		
		
		
		new AnimalFarm().animals();
	}
	
		
	
	void animals() {

		String animalPick = JOptionPane.showInputDialog("what animal in my farm would you like to hear and see; a duck, a dog, a cat, a llama, or a cow");
			if (animalPick.contains("ow")) {
				moo();
			}
			if (animalPick.contains("uck")) {
				quack();
			}
			if (animalPick.contains("og")) {
				woof();
			}
			if (animalPick.contains("at")) {
				meow();
			}
			if (animalPick.contains("llama")) {
				llamaScream();
			} else {
				JOptionPane.showMessageDialog(null, "sorry, but I don't have that animal on my farm");
			}

	}

 	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}

	void quack() {
		playNoise(quackFile);
		showImage(duckIcon);
	}

	void woof() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
	
	void meow() {
		playNoise(meowFile);
		showImage(catIcon);
	}
	
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	static String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
    ImageIcon cowIcon;
	
	private static void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private static void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}
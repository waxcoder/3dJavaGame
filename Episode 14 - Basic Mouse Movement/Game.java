package me.lclc98.com;

import java.awt.event.KeyEvent;

import me.lclc98.com.input.Controller;

public class Game {
	public int time;
	public Controller controls;

	public Game() {
		controls = new Controller();
	}

	public void tick(boolean[] key) {
		time++;
		boolean forward = key[KeyEvent.VK_W];
		boolean back = key[KeyEvent.VK_S];
		boolean left = key[KeyEvent.VK_A];
		boolean right = key[KeyEvent.VK_D];
		
	

		controls.tick(forward, back, left, right);
	}
}

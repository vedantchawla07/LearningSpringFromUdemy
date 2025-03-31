package com.example.learn_spring_framework;

public class GameRunner {
	Game game;
	public GameRunner(Game game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Callig all the functions");
		game.up();
		game.down();
		game.right();
		game.left();
	}
}

package com.example.learn_spring_framework;

public class MarioGame implements Game {

	@Override
	public void up() {
		System.out.println("Jumping");
	}

	@Override
	public void down() {
		System.out.println("Crouching");
		
	}

	@Override
	public void left() {
		System.out.println("Doing nothing");
		
	}

	@Override
	public void right() {
		System.out.println("Going right");
		
	}

}

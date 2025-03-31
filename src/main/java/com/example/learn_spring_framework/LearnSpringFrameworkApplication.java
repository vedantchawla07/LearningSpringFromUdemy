package com.example.learn_spring_framework;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		var game2 = new MarioGame();
		gameRunner = new GameRunner(game2);
		gameRunner.run();

		
	}

}

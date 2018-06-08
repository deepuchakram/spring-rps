package com.mcnz.rps.spring;

public class GameService {
		
	Score score = new Score();
	
	public void playRoshambo(String clientGesture) {

		if (clientGesture.equals("scissors")) {
			score.increaseWins();
		}
	}
}

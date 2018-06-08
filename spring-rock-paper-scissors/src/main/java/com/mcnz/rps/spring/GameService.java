package com.mcnz.rps.spring;

public class GameService {
		
	Score score = new Score();
	
	public void playRoshambo(String clientGesture) {

		if (clientGesture.equals("scissors")) {
			score.increaseWins();
		}
		
	}
	
	public static void main(String args[]) {
		GameService gameService = new GameService();
		gameService.playRoshambo("scissors");
		System.out.println(gameService.score.wins);
	}
}



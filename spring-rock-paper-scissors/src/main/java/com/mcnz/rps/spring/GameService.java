package com.mcnz.rps.spring;

public class GameService {
		
	Score score = new Score();
	
	public void playRoshambo(String clientGesture) {

		if (clientGesture.equals("scissors")) {
			score.wins++;
		}
		System.out.println(score.wins);
		
	}
	
	public static void main(String args[]) {
//		GameService gameService = new GameService();
//		gameService.playRoshambo("scissors");
//		gameService.playRoshambo("scissors");
//		gameService.playRoshambo("scissors");
		System.out.println("Hello World");
	}
}



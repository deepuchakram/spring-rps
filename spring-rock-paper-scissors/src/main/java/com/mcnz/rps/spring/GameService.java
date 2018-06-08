package com.mcnz.rps.spring;

public class GameService {
		
	Score score = new Score();
	
	public void playGame(String clientGesture) {

		if (clientGesture.equals("scissors")) { score.wins++; }
		System.out.println(score.wins);
		
	}
}



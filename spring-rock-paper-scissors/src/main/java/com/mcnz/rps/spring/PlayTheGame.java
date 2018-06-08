package com.mcnz.rps.spring;

public class PlayTheGame {

	public static void main(String args[]) {
		GameService gameService = new GameService();
		gameService.playGame("scissors");
		gameService.playGame("scissors");
		gameService.playGame("scissors");

	}
}

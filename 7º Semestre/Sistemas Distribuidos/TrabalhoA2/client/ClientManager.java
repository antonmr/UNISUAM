package client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import shared.GameStatus;
import shared.IGameManager;

public class ClientManager {
	String[] args;
	IGameManager gameManager = null;
	int playerId;
	
	Timer gameStatustimer;
	GameStatus gameStatus;
	
	public ClientManager(String[] args) {
		this.args = args;
		gameStatustimer = new Timer();
	}
	
	public void connectToServer() {
		try {
			String objname = "//" + args[0] + "/" + args[1];
			System.out.println("Aguardando o objeto: " + objname);
			gameManager = (IGameManager) Naming.lookup(objname);
		} catch(Exception e) {
			System.err.println("Problemas de inicialização: " + e);
			e.printStackTrace();
			System.exit(2);
		}
	}
	
	public void start() {
		try {
			playerId = gameManager.getUniquePlayerId();
			System.out.println("Player ID: " + playerId);
			
			do {
				gameStatus = gameManager.getGameStatus(playerId);
				System.out.print("\rSTATUS: " + gameStatus.toString());
			} while(gameStatus == GameStatus.WAITING_FOR_PLAYERS);
			
			if(gameStatus == GameStatus.IN_GAME) {
				System.out.println();
				setGameStatusTimer();
				
				while(gameStatus == GameStatus.IN_GAME) {					
					if(gameManager.isPlayerTurn(playerId)) {
						System.out.print("\rCURRENT TURN: YOU");
						
						String sAnswer = JOptionPane.showInputDialog("Pergunta (ID: " + playerId + ")");
						System.out.println("Answer: " + sAnswer);
						int answer = Integer.parseInt(sAnswer);
						
						boolean isCorrectAnswer = gameManager.isAnswerCorrect(playerId, answer);
						if(isCorrectAnswer)
							System.out.println("ANSWER IS CORRECT! :D");
						else
							System.out.print("WRONG ANSWER! :(");
					} else {
						System.out.print("\rCURRENT TURN: ENEMY");
					}
					
					gameStatus = gameManager.getGameStatus(playerId);
				}
				
				gameStatustimer.cancel();
				System.out.println("THE GAME HAS ENDED!");
			} else {
				System.err.println("\nGame Status is not IN_GAME: " + gameStatus.toString());
				System.exit(4);
			}
		} catch(RemoteException e) {
			System.err.println("Problemas com a chamada remota: " + e);
			e.printStackTrace();
			System.exit(3);
		}
	}
	
	public void setGameStatusTimer() {
		gameStatustimer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				try {
					gameStatus = gameManager.getGameStatus(playerId);
					
					
				} catch(RemoteException re) {
					System.err.println("Problemas com a chamada remota: " + re);
					re.printStackTrace();
					System.exit(5);
				}
			}
		}, 5000, 1000);
	}
}

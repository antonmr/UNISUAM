package shared;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GameManager extends UnicastRemoteObject implements IGameManager {
	private static final long serialVersionUID = 1L;
	
	private int playerCount; 
	private Player player1 = null, player2 = null;
	private Player currentPlayer = null;
	private GameStatus gameStatus;
	
	public GameManager() throws RemoteException {
		playerCount = 0;
		gameStatus = GameStatus.WAITING_FOR_PLAYERS;
	}
	
	public int getUniquePlayerId() throws RemoteException {
		playerCount++;
		
		if(player1 == null) {
			player1 = new Player(playerCount);
			return player1.getUniqueId();
		}
		
		if(player2 == null) {
			player2 = new Player(playerCount);
			currentPlayer = player1;
			return player2.getUniqueId();
		}
		
		return playerCount;
	}
	
	public GameStatus getGameStatus(int playerId) throws RemoteException {
		refreshGameStatus();
		System.out.println("GameStatus [#" + playerId + "]: " + gameStatus.toString());
		return gameStatus;
	}
	
	private void refreshGameStatus() {
		if(player1 == null || player2 == null)
			gameStatus = GameStatus.WAITING_FOR_PLAYERS;
		else
			gameStatus = GameStatus.IN_GAME;
	}

	private void switchCurrentPlayer(int playerId) {
		int player1Id = player1.getUniqueId();
		int player2Id = player2.getUniqueId();
		
		if(playerId == player1Id || playerId == player2Id) {
			if(playerId == player1Id)
				currentPlayer = player2;
			else if(playerId == player2Id)
				currentPlayer = player1;
		}
	}
	
	public boolean isPlayerTurn(int playerId) throws RemoteException {
		System.out.println("IsPlayerTurn [#" + playerId + "]: " + currentPlayer.getUniqueId());
		
		if(currentPlayer.getUniqueId() == playerId)
			return true;
		
		return false;
	}
	
	public boolean isAnswerCorrect(int playerId, int answer) throws RemoteException {
		if(currentPlayer.getUniqueId() == playerId && answer == 2) {
			currentPlayer.increaseCorrectAnswersCountBy(1);
			return true;
		} else if(currentPlayer.getUniqueId() == playerId && answer != 2) {
			switchCurrentPlayer(playerId);
		}
			
		return false;
	}
}

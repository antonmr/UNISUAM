package shared;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGameManager extends Remote {
	int getUniquePlayerId() throws RemoteException;
	GameStatus getGameStatus(int playerId) throws RemoteException;
	boolean isPlayerTurn(int playerId) throws RemoteException;
	boolean isAnswerCorrect(int playerId, int answer) throws RemoteException;
}

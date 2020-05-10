
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IChatAula extends Remote{
	void sendMessage(Message p) throws RemoteException;
	List<Message> retrieveMessage() throws RemoteException;
}


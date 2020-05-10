

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatAula extends UnicastRemoteObject implements IChatAula{

	private static final long serialVersionUID = 1L;

	public ChatAula() throws RemoteException {
		
	}
	
	public List<Message> lstObjeto = new ArrayList<>(); 

	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.setLstMessage(msg);
		
	}

	@Override
	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getLstMessage();
	}
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ChatServer {

	public ChatServer() throws RemoteException {
		try {
			LocateRegistry.createRegistry(8282);
			System.out.println("Inicio");
			Naming.rebind("rmi://localhost:8282/chat", new ChatAula());
			System.out.println("Fim");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		new ChatServer();
	}
}

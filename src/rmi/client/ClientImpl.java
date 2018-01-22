package rmi.client;

import rmi.server.Server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientImpl implements Client {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager());

		try {
			Registry registry = LocateRegistry.getRegistry(args[0]);
			Server server = (Server) registry.lookup(args[1]);
			server.test(args[2]);
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}

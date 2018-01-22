package rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements Server {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager());

		try {
			Server stub = (Server) UnicastRemoteObject.exportObject(new ServerImpl(), 0);
			Registry registry = LocateRegistry.getRegistry();

			registry.rebind(args[0], stub);
			System.out.println("Server is on");
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void test(String s) {
		System.out.println(s);
	}
}

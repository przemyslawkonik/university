package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
	void test(String s) throws RemoteException;
}

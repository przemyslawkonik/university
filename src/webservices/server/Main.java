package webservices.server;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        Endpoint.publish("http://localhost:8080/echo", server);
    }
}

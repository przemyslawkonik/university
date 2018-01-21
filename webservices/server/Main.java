package server;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        WebServer server = new WebServer();
        Endpoint.publish("http://localhost:8080/echo", server);
    }
}

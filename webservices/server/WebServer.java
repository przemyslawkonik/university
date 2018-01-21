package server;

import javax.jws.WebService;

@WebService(endpointInterface = "server.Echo")
public class WebServer implements Echo {

    @Override
    public String reply(String msg) {
        return msg;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

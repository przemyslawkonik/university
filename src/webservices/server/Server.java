package webservices.server;

import javax.jws.WebService;

@WebService(endpointInterface = "webservices.server.Echo")
public class Server implements Echo {

    @Override
    public String reply(String msg) {
        return msg;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

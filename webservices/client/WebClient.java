package client;

public class WebClient {

    public static void main(String[] args) {
        WebServerService server = new WebServerService();
        Echo client = server.getWebServerPort();

        System.out.println(client.reply("Echo"));
        System.out.println(client.add(2, 2));
    }
}

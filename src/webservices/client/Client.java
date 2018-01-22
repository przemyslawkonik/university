package webservices.client;

public class Client {

    public static void main(String[] args) {
        ServerService server = new ServerService();
        Echo client = server.getServerPort();

        System.out.println(client.reply("Echo"));
        System.out.println(client.add(2, 2));
    }
}

import java.net.*;
class networking {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("google.com");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("threadstory.in");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);
    }
}
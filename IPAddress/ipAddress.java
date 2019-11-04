import java.net.*;
// import java.net.InetAddress;
class Illustration{
    public static void main(String[] args)throws UnknownHostException{
        InetAddress I=InetAddress.getLocalHost();
        System.out.println("My IP address "+I);
        InetAddress I2 []=InetAddress.getAllByName("www.google.com");
        for(InetAddress K :I2){
        System.out.println("Google's IP address "+K);
        }
        // System.out.println(I2.length);
    }
}
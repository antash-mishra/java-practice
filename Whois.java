import java.net.*;
import java.io.*;

class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        //create a socket
        Socket s = new Socket("internic.net", 43);

        //input and output stream
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        //construct request string
        String str = (args.length == 0 ? "threadstory.in" : args[0]) + "\n";
        byte buf[] = str.getBytes();

        //send request
        out.write(buf);

        //Read and display response
        while((c=in.read())!= -1) {
            System.out.println((char) c);
        }
        s.close();
    }
}
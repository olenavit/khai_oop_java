package HTTP;

import ua.ArtBook;
import ua.Book.Book;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class HTTPServer implements Runnable {

    static private ServerSocket server;
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectOutputStream outputLibrary;
    static private ObjectInputStream input;

    public static void main(String[] args) {
        new Thread(new HTTPServer()).start();
    }

    @Override
    public void run() {
        List<String> list = new ArrayList<>();
        try {
            server= new ServerSocket(5678,10);
            while (true){
                connection=server.accept();
                output=new ObjectOutputStream(connection.getOutputStream());
                //outputLibrary = new ObjectOutputStream(connection.getOutputStream());
                input=new ObjectInputStream(connection.getInputStream());
                list.add(input.readObject().toString());
                output.writeObject("Book : "+ input.readObject()+" "+'"'+ input.readObject()+'"'+" was added");
                //outputLibrary.writeObject(list);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

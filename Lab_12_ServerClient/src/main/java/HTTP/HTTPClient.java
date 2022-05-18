package HTTP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

public class HTTPClient extends JFrame implements Runnable {
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectOutputStream outputLibrary;
    static private ObjectInputStream input;
    static private String address = "127.0.0.1";
    static private int port = 5678;

    public static void main(String[] args) throws IOException {
        new Thread(new HTTPClient("LIBRARY")).start();

    }

    public HTTPClient(String name) throws IOException {
        super(name);
        setLayout(new FlowLayout());
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        final JTextField bookName = new JTextField(10);
        final JTextField bookAuthor = new JTextField(10);
        final JLabel label1 = new JLabel("Book name: ", SwingConstants.CENTER);
        final JLabel label2 = new JLabel("Book author: ",SwingConstants.CENTER);
        final JButton b1 = new JButton("add book");
        final JButton b2 = new JButton("remove book");
        final DefaultListModel dfm = new DefaultListModel();
        JList myList = new JList(dfm);
        JScrollPane myScrollPaneList = new JScrollPane(myList);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent argO) {
                if (argO.getSource() == b1) {
                    sendDate(bookName.getText());
                    sendDate(bookAuthor.getText());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(bookName.getText()).append(" ").append(bookAuthor.getText());
                    dfm.addElement(stringBuilder);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    int index = myList.getSelectedIndex();
                    dfm.remove(index);
                }
            }
        });
        add(label1);
        add(bookName);
        add(label2);
        add(bookAuthor);
        add(b1);
        add(b2);
        add(myScrollPaneList);
        add(myList);
    }


    @Override
    public void run() {
        try {
            while (true) {

                connection = new Socket(InetAddress.getByName(address), port);
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                JOptionPane.showMessageDialog(null, input.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    static private void sendDate(Object obj){

        try {
            output.flush();
            output.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

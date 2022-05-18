package ua;

import ua.Book.Book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread producer = new Thread(() -> {
            try {
                producerConsumer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread firstConsumer = new Thread(() -> {
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread secondConsumer = new Thread(() -> {
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();
        firstConsumer.start();
        secondConsumer.start();
        producer.join();
        firstConsumer.join();
        secondConsumer.join();
    }

}

class ProducerConsumer {
    private final Queue<Book> library = new LinkedList<>();
    private final int LIMIT = 10;
    final Object lock = new Object();

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (library.size() == LIMIT) {
                    lock.wait();
                }
                Book book = chooseBook();
                library.offer(book);
                System.out.println("Adding to library: " + book.getClassName());
                lock.notify();
            }
        }
    }


    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (library.size() == 0) {
                    lock.wait();
                }
                Book book = library.poll();
                System.out.println(book.getClassName() + " was got from Library");
                System.out.println("Library contains: " + library.size() + " books.");
                lock.notify();
            }
            Thread.sleep(10000);
        }
    }

    private Book chooseBook() {
        Random random = new Random();
        int n = random.nextInt(3);
        return switch (n) {
            case 0 -> new ArtBook();
            case 1 -> new MysteryBook();
            case 2 -> new HistoryBook();
            default -> null;
        };
    }
}



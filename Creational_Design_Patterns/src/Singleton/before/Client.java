package Singleton.before;

public class Client {
    public static void main(String[] args) {
        thread_unsafe object_1 = thread_unsafe.getInstance();// first instance created.
        thread_unsafe object_2 = thread_unsafe.getInstance(); // above instance returned.
    }

}

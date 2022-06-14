package Singleton.after;

public class thread_safe_synchronized {
    private thread_safe_synchronized(){}
    private static thread_safe_synchronized single_instance = null;
    public synchronized static thread_safe_synchronized getInstance() {
        if (single_instance == null) {
            single_instance = new thread_safe_synchronized();
            return single_instance;
        }
        return single_instance;
    }
    // synchronized will be slow in case of large traffic(multi threaded environment) as each thread will have to wait for it's turn.
    public void printInstanceAddress(thread_safe_synchronized object){
        System.out.println("Singleton Instance Address: " + object);
    }
}

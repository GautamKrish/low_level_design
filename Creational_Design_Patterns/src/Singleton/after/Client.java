package Singleton.after;

public class Client {
    public static void main(String[] args){
        thread_safe_synchronized singleton_one = thread_safe_synchronized.getInstance();
        thread_safe_synchronized singleton_two = thread_safe_synchronized.getInstance();
        if(singleton_one == singleton_two)
            System.out.println("Successful in restricting number of instances to one.");

        thread_safe_class_loading singleton_three = thread_safe_class_loading.getInstance();
        singleton_three.printInstanceAddress();
    }
}

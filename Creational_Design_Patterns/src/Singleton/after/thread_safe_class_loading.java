package Singleton.after;

public class thread_safe_class_loading {

    private thread_safe_class_loading(){}
    private static thread_safe_class_loading single_instance = new thread_safe_class_loading(); // simple solution as object creation happens on class-loading but performance is slow
    public static thread_safe_class_loading getInstance(){
        return single_instance;
    }

    public void printInstanceAddress(){
        System.out.println("Singleton Instance Address (Class-Loading Solution): " + single_instance);
    }

}

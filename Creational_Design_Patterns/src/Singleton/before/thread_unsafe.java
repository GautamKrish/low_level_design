package Singleton.before;

public class thread_unsafe {
    private static thread_unsafe single_instance;
    private thread_unsafe(){} // private-constructor to prevent objects from being created outside of this class
    public static thread_unsafe getInstance(){
        if(single_instance == null){
            single_instance = new thread_unsafe();
            return single_instance;
        }
        return single_instance;
    }
    /*  static because needs to be accessed without creating an object of this.
        If Client is given privilege to create objects then defeats the purpose of Singleton as multiple objects can be created.
    */
}

package Singleton.after;

public class thread_safe_two_phase_locking {
    private thread_safe_two_phase_locking(){}
    private thread_safe_two_phase_locking single_instance = null;
    public thread_safe_two_phase_locking getInstance(){
        if(single_instance == null){ // can be executed parallely in multi-core CPU.
            synchronized (thread_safe_two_phase_locking.class){ // will be executed one at a time.
                if(single_instance == null)
                    single_instance = new thread_safe_two_phase_locking();
            }
        }
        return single_instance;
    }
}

package dp.singelton;

public class DB {
    // the volatile ensures that the variable is always declared and read from and written from the main memory
    // rather than from the thread's local cache
    // this ensures that the changes made on the main thread are immediately visible to other threads
    private static volatile DB instance;
    // make the constructor private so we cannot instantiate the object
    private DB(){}

    public static DB getInstance(){
        // first check
        if(instance == null){
            // enter a synchronized block to ensures that one thread can create an instance
            synchronized (DB.class){
                if(instance == null){
                    instance = new DB();
                }
            }
        }
        return instance;
    }

}

package singleton;

public class DoubleChekLocking {

    private static volatile DoubleChekLocking instance;

    private DoubleChekLocking(){}

    private static DoubleChekLocking getInstance(){
        if (instance == null){
            synchronized (DoubleChekLocking.class){
                if (instance == null){
                    instance = new DoubleChekLocking();
                }
            }
        }
        return instance;
    }

}

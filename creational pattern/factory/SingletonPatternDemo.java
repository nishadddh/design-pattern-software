package factory;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
    	//singleton object = new singleton();

        // Get the only object available
        singleton object1 = singleton.getInstance();

        
        object1.showMessage();
    }
}
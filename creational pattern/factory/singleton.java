package factory;

public class singleton {
    // Create an object of SingleObject
    private static singleton instance = new singleton();

    // Make the constructor private so that this class cannot be instantiated
   private  singleton() {}

    // Get the only object available
    public static singleton getInstance() {
        return instance;
    }


	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}


}
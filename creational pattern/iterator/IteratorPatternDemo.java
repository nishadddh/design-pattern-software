package iterator;

public class IteratorPatternDemo {
	 public static void main(String[] args) {
	 EmployeeRepository namesRepository = new EmployeeRepository();
	 for(Iterator iter = namesRepository.getIterator();
	iter.hasNext();){
	 String name = (String)iter.next();
	 System.out.println("Employee Name : " + name);
	 }
	 }
	}
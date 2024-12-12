package secondClass;

public class Car {
    public void applyAcclator() {
    	System.out.println("applyAcclator");
    }
    public void applyStreeing() {
    	System.out.println("applyStreeing");
    }
    	public static void main(String[] args) {
    		Car Obj = new Car();
    		Obj.applyAcclator();
    		Obj.applyStreeing();	
    }
}

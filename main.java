package day4;

public class main {

	public static void main(String[] args) { 
		
		
		
		        for(int i= 0;i<5;i++) {
    	       System.out.println("iteration:" + i);
           }
		
		int age = 19;
		if(age>=21) {
			System.out.println(age+"  eligible to vote");
		}
		else {
			System.out.println(age+"  is not eligible to vote");
		}
		// write a program to print a odd number.[p;;p
			System.out.println("the odd numbers are : ");
			for(int i = 1; i<=100; i++) {
				if(i % 2!= 0) {
					System.out.println(i);
				}
			}
	}
}

package week3.Day2;

public class Axisbank extends YesBank implements AmericanExpress {

	@Override
	public void salaryaccount() {
		System.out.println("salaryaccount");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void limitLessDeposit() {
		System.out.println("limitLessDeposit");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		

		
	Axisbank obj = new Axisbank();
	obj.salaryaccount();
	obj.limitLessDeposit();
}
}
package nithaj;

class Bankaccount{
	int amount=0,amo;
	void deposit(int a) {
		amo+=a;
		System.out.println("I am new");
	}
	void withdraw(int b) {
		System.out.println("I got salary");
}
}

class Savingaccount extends Bankaccount{
	void withdraw(int b) {
		if(amo<=100) {
		System.out.println("your account has insufficient balance");
	}
	}
	
	
}

public class Savebank {

	public static void main(String[] args) {
		Savingaccount obj=new Savingaccount();
		obj.deposit(50);
		obj.withdraw(2000);

	}

}

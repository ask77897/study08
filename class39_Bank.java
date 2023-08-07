package project08;

public class class39_Bank {
	private String num;
	private int cash;
	private int password;
	
	class39_Bank(){
		num = "?";
		cash = 0;
	}
	
	class39_Bank(String num, int cash){
		this.num = num;
		this.cash = cash;
	}
	
	int getcash() {
		return cash;
	}
	void deposit(int amount) {
		if(amount < 0) {
			System.err.println("잘못된 입력입니다.");
			return;
		}
		this.cash += amount;
	}
	void withdraw(int amount) {
		if(amount < 0||amount > cash) {
			System.err.println("잘못된 입력입니다. 잔액이 부족합니다.");
			return;
		}
		this.cash -= amount;
	}
	void printinfo() {
		System.out.println(num+"의 잔액은 "+cash+"원 입니다.");
	}
	
}

// package project08;

import java.util.Scanner;

public class test04_Food extends test04_Restaurant{
	Scanner sc = new Scanner(System.in);
	private String resname;
	private int resnum;
	
	
	test04_Food(){
		
	}
	test04_Food(String name, int chair){
		super(name, chair);
	}
	test04_Food(String name, int chair, String resname, int resnum){
		super(name, chair);
		this.resname = resname;
		this.resnum = resnum;
	}
	@Override
	void printinfo() {
		System.out.println("현재 예약되어 있는 좌석은 "+resnum+"개 입니다.");
		System.out.println(name+"의 남은 좌석 수는 "+ (getChair()-resnum)+ "입니다.");
	}
	
	void reservation(String name, int num) {
		if(num < 0) {
			System.err.println("잘못된 입력입니다.");
			return;
		}else if(num>(this.getChair()-resnum)) {
			System.err.println("좌석이 부족합니다.");
			return;
		}
		System.out.println(name+"님의 이름으로 "+num+"개의 좌석이 예약되었습니다.");
		this.resnum += num;
	}

}

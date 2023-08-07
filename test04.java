// package project08;

import java.util.ArrayList;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		//1.
		//식당 + 좌석 수, 소비자 -> 예약자명, 인원수
		//남은 좌석 수보다 인원수가 더 많으면 예약 불가
		//오버라이딩, 캡슐화
//		test04_Restaurant res = new test04_Restaurant("식당1", 50);
//		test04_Food res1 = new test04_Food("식당2", 50);
//		
//		res.printinfo();
//		res1.printinfo();
//		res1.reservation("kim", 10);
//		res1.reservation("lee", 20);
//		res1.reservation("park", 33);
//		
//		res1.printinfo();
		
		

		//2.
		//RPG게임
		//유닛 -> 캐릭터, 몬스터 -> 직업
		//유닛 -> 공격, 레벨업, 체력
		//몬스터 -> 타입
		//캐릭터 -> 경험치
		//직업 -> 직업 이름
//		test04_Monster mob1 = new test04_Monster("슬라임");
//		test04_Character cha1 = new test04_Character("k");
//		cha1.infor();
//		mob1.printInfo();
//		mob1.printInfo();
		
		String [] mobList = new String[2];
		test04_Character p1 = new test04_Character("A", 1, 200, 0, 20);
		test04_Character p2 = new test04_Character("B", 1, 100, 0, 10);
		test04_Monster m1 = new test04_Monster("슬라임", 100, 10, "물");
		test04_Monster m2 = new test04_Monster("스켈레톤", 50, 20,"언데드");
		test04_Monster m3 = new test04_Monster("샐러맨더", 70, 30,"불");
		test04_Monster m4 = new test04_Monster("골렘", 200, 50,"바위");
		test04_Monster m5 = new test04_Monster("네펜데스", 50, 5,"풀");
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i>=0; i++) { 
			int a = (int)((Math.random()*5)+1);
			p1.infor();
			p2.infor();
			System.out.println("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y, n) :");
			if(a==1){
				m1.printInfo();
			}else if(a==2){
				m2.printInfo();
			}else if(a==3){
				m3.printInfo();
			}else if(a==4){
				m4.printInfo();
			}else if(a==5){
				m5.printInfo();
			}
			
			String fightYN = sc.next();
			
			if(fightYN.equals("y")) {
				p1.fight();
				p2.fight();
				// for(int j=; j) {
					
				// }
				p1.clear((int)(Math.random()*90)+10);
				p2.clear((int)(Math.random()*90)+10);
			} else {
				m1.attack();
				p1.avoid();
			}
		}
		

	}

}

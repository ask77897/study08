// package project08;

public class test04_Monster extends test04_rpgGame{
	String type;
	
	test04_Monster(String name, int health, String type){
		super(name, health);
		this.type = type;
	}
	test04_Monster(String name, int health, int attack, String type){
		super(name, health, attack);
		this.type = type;
	}
	
	test04_Monster(String name){
		super(name);
	}
	
	// void incount(){
	// 	int a = (int)(Math.random()*2);
	// 	if(a==1){
	// 		System.out.println(m1.);
	// 	}
	// }
	void printInfo() {
		System.out.println("이름: "+getname()+", 체력"+gethealth()
			+", 공격력: "+getattack()+", 타입: "+type);
	}
	void attack() {
		System.out.println(getname()+ "이(가) 공격합니다.");
	}
}

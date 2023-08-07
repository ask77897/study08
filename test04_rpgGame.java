// package project08;

import java.util.Scanner;

public class test04_rpgGame {
			//2.
			//RPG게임
			//유닛 -> 캐릭터, 몬스터 -> 직업
			//유닛 -> 공격, 레벨업, 체력
			//몬스터 -> 타입
			//캐릭터 -> 경험치
			//직업 -> 직업 이름
	private String name;
	private int health;
	private int attack;
	private int level;
	
	
	test04_rpgGame(){
		
	}
	test04_rpgGame(int level){
		this.level = level;
	}
	test04_rpgGame(String name){
		this.name = name;
	}
	test04_rpgGame(String name, int health){
		this.name = name;
		this.health = health;
	}
	test04_rpgGame(String name, int health, int attack){
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	test04_rpgGame(String name, int level, int health, int attack){
		this.name = name;
		this.level = level;
		this.health = health;
		this.attack = attack;
	}
	int getlevel() {
		return level;
	}
	int gethealth() {
		return this.health;
	}
	int getattack() {
		return attack;
	}
	String getname() {
		return name;
	}
	int setlevel(int level) {
		return ++this.level;
	}
	int sethealth(int health){
		return this.health=this.health+(this.health*10/100);
	}
	int setattack(int attack){
		return this.attack=this.attack+(this.attack*12/100);
	}
}

package project08;

public class class38_movie {
	private String name;
	private int time;
	
	private class38_movie(){
		name = "??";
		time = 0;
	}
	
	class38_movie(String name){
		this.name = name;
	}
	class38_movie(int time){
		this.time = time;
	}
	class38_movie(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	void printTh() {
		System.out.println("\""+name+"\"" +"의 상영시간은 "+time+"분입니다.");
	}
	String getName() {
		return name;
	}
	int getTime() {
		return time;
	}
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
		this.time = time;
	}
}

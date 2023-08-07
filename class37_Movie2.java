package project08;

public class class37_Movie2 extends class37_Theater{
	String genre;
	
	class37_Movie2(){
		
	}
	
	class37_Movie2(String name){
		super(name);
		this.genre = "공포영화";
	}
	class37_Movie2(String name, int time){
		super(name, time);
		this.genre = "공포영화";
	}
	class37_Movie2(String name, int time, String genre){
		super(name, time);
		this.genre = genre;
	}
	
//	void printgenre() {
//		System.out.println("이 "+genre+"의 추천 영화는 "+name+"입니다.");
//		super.printTh();
//	}
	@Override
	void printTh() {
		System.out.println(genre+"의 추천 영화는 "+name+"입니다.");
		System.out.println("\""+name+"\"" +"의 상영시간은 "+time+"분입니다.");
	}
}

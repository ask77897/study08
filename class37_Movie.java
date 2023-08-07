package project08;
//영화 클래스(제목, 상영시간)1.영화제목, 상영시간 출력 2.영화장르 출력 -> 영화 장르2~3개 -> 메인에서 출력
public class class37_Movie extends class37_Theater{
	String genre;
	
	class37_Movie(){
		
	}
	
	class37_Movie(String name, String genre){
		super(name);
		this.genre = genre;
	}
	class37_Movie(String name, int time){
		super(name, time);
		this.genre = "공상과학영화";
	}
	class37_Movie(String name, int time, String genre){
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

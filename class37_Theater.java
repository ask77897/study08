package project08;
//영화 클래스(제목, 상영시간)1.영화제목, 상영시간 출력 2.영화장르 출력 -> 영화 장르2~3개 -> 메인에서 출력
public class class37_Theater {
	String name;
	int time;
	
	class37_Theater(){
		name = "??";
		time = 0;
	}
	
	class37_Theater(String name){
		this.name = name;
	}
	class37_Theater(int time){
		this.time = time;
	}
	class37_Theater(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	void printTh() {
		System.out.println("\""+name+"\"" +"의 상영시간은 "+time+"분입니다.");
	}
	
}

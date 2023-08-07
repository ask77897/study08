package project08;

public class class37 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		cat cat = new cat();
		
		animal.makesound();
		cat.makesound();
		
		class37_Theater thea = new class37_Theater("영화이름", 100);
		class37_Movie movie = new class37_Movie("공상과학영화이름", 140);
		class37_Movie2 movie2 = new class37_Movie2("공포영화이름", 120);
		
		thea.printTh();
		movie.printTh();
		movie2.printTh();
		
		

	}//main
}

class Animal{
	void makesound() {
		System.out.println("동물이 울음소리를 낸다.");
	}
}

class cat extends Animal{
	@Override
	void makesound() {
		System.out.println("야옹~");
	}
}


//오버라이딩(method overriding)
//부모 클래스의 메소드를 자식 클래스에 재정의 하는 것.
//부모 클래스의 동작을 자기 동작으로 바꾼다.

//굳이 부모 클래스를 수정하지 않고, 자식 클래스에서 메소드 기능을 변경할 수 있다.
//주석 -> 컴퓨터가 읽지 못하는 메모
//컴퓨터가 읽을 수 있는 메모 -> @Override
//오버라이딩할 메소드는 접근지정자(public), 반환 자료형, 매개변수 갯수, 자료형이 부모 클래스와 일치해야 한다.

//영화 클래스(제목, 상영시간)1.영화제목, 상영시간 출력 2.영화장르 출력 -> 영화 장르2~3개 -> 메인에서 출력

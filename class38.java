package project08;

public class class38 {

	public static void main(String[] args) {
		class38_movie thea = new class38_movie("영화이름", 100);
//		class38_movie thea2 = new class38_movie();
		
		thea.printTh();
//		System.out.println(thea.name + thea.time); //정보은닉성공
		thea.setTime(120);
		System.out.println(thea.getName() + thea.getTime());
		
		
	}

}

//캡슐화(Encapsulation)
//객체 지향 프로그래밍에서 사용되는 개념
//객체의 형채를 보호하기 위해 데이터(변수)와 기능(메소드)를 하나로 묶는 것을 말한다.
//보안성 -> 외부에서 객체 내부에 직접적으로 접근하는 것을 제한한다. 객체의 무결성을 유지하고, 객체의 사용법을 간소화할 수 있다.

//캡슐화 이후에는 당연히 내부상태를 외부에서 직접적으로 수정할 수 없음.

//접근 제한자(Access Modifier)
//public*, protected, default, private*
//public -> 모든 코드에서 접근이 가능하다.
//private -> 해당 클래스 내부에서만 접근이 가능하다.
//protected -> 동일 패키지 내에서는 모두 접근 가능, 외부 패키지에서는 상속을 받은 클래스 내부에서만 접근 가능
//default -> 동일 패키지 내에서만 접근 가능

//정보 은닉(information hiding)
//private int num;
//getNum();, setNum(int num); -> getter, setter 메소드

//getter, setter -> 인스턴스 변수의 값을 변경하는 역할을 한다.
//게터와 세터를 통해 정보은닉 유지하고, 외부에서도 필요한 데이터에 접근을 가능하게 한다.

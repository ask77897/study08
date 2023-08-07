package project08;

public class class39 {

	public static void main(String[] args) {
		class39_Bank kim = new class39_Bank("110-111-111111", 1000000);

		System.out.println("계좌의 잔액은 " + kim.getcash() + "원 입니다.");
		kim.deposit(10000);
		kim.deposit(-10000);
		
		kim.withdraw(10000000);
		kim.withdraw(99999999);
		
		System.out.println("계좌의 잔액은 " + kim.getcash() + "원 입니다.");
		
	}

}

//캡슐화 -> 정보 은닉
//은행 계좌 클래스
//계좌번호 -> 변동불가, 잔액 -> 변동가능

//1.
//식당 + 좌석 수, 소비자 -> 에약자명, 인원수
//남은 좌석 수보다 인원수가 더 많으면 예약 불가
//오버라이딩, 캡슐화

//2.
//RPG게임
//유닛 -> 캐릭터, 몬스터 -> 직업
//유닛 -> 공격, 레벨업, 체력
//몬스터 -> 타입
//캐릭터 -> 경험치
//직업 -> 직업 이름

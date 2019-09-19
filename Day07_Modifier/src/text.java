
public class text {
//	1. DataType
//		1) Primitive Type : 변수의 값이 실제 값일때, 총 8개
//		2) Reference Type : 변수의 값이 실제 객체를 가리키는 주소값일때
//	2. 변수가 선언되는(만들어지는) 메모리 영역
//		1)stack : 지역 변수 (2)
//		2)heap	: 멤버 변수(인스턴스 변수) (3)
//		3)static : 클래스 변수 (1)
//	3. 기타
//		참조 변수, 인자값
//	
//	상속과 다형성
//	
//	1. 상속(Inheritance, Extends)
//		- 기존의 클래스를 재사용해서 새로운 클래스를 만드는데 사용(도와줌)
//		- 부모 클래스(super)와 자손 클래스(child)와의 관계를 생성
//		- 자손 클래스는 부모 클래스의 모든 것을 상속.
//		- 단, 생성자, 초기화 블럭은 제외
//		- 부모 클래스의 변경은 자손에 영향 있지만, 자손 클래스 변경은 부모에 영향 없음
//		- 상속은 단일 상속
//	-----------초기화 블럭---------------------
//	1) 인스턴스 초기화 블럭
//		- 객체 생성할 때마다 호출
//		- 생성자보다 먼저 호출
//		- 각 생성자에서 공통으로 진행되는 코드를 기술
//	2) static 초기화 블럭	
//		- 프로그램이 실행되기 전에 한 번만 호출
//		- 클래스 변수의 초기화를 담당
//		- 클래스 내에 static { 초기화 코드 작성 }

	
//	2. 상속과 포함
//		상속	:	자손 클래스명 is a 부모 클래스명
//		포함	:	자속 클래스명 has a 부모 클래스명
//		Ex	:	마린은 유닛이다. (Marine is a Unit)
//			:	마린은 유닛에 포함된다.	(Marine has a Unit)
//	3. 메서드 오버라이딩
//		- 상속받은 메서드를 자신의 내용에 맞게 재정의하는 것
//		- 메서드의 선언부는 동일해야 함
//		- 단, 접근 지정자는 부모 클래스보다 넓은 범위로는 수정이 가능
//		Ex	: 부모가 private이면 defalut 이상 변경 가능
	
//	오버 라이딩 구분
//	부모 클래스
//	public void p1() {}
	
//	자식 클래스 extends 부모 클래스
	
//	public void p1() {}	// 오버 라이딩
//	public void p1(int a) {} // 오버 로딩
	
//	4. 추상 클래스
//		- 미완성 클래스
//		- 멤버 변수, 멤버 메서드, 생성자, 추상 메서드
//		- 데이터 타입으로는 존재하지만 객체를 생성할 수 없음
//		- 다른 클래스를 생성할 때 도움을 줌(상속)
//	5. Super
//		- super
//				: 부모의 객체를 참조하는 참조 변수
//		- super()
//				: 부모의 생성자 호출
//				: 생성자 라인에 맨 윗줄에 위치
//	6. Interface
//		- 추상 클래스보다 더 미완성
//		- 멤버 상수, 추상 메서드
//		- 일종의 추상 클래스
//		- 구현(implements), 다중 구현(multiplex)
//		- 표준화
//		- 관계가 없는 것들에게 관계를 맺어줌
//	7. 다형성 (Polymorph)
//		- class는 DataType
//		- 하나의 참조 변수로 여러 타입의 객체를 참조하는 것
//		- 다형성은 부모 자식간의 관계에서만 가능 (상속끼리)
//	===============================================
//	자주 쓰는 API(https://docs.oracle.com/javase/8/docs/api/index.html)
//	1. java.lang.Object
//		- Object는 모든 클래스의 부모(super)이다.
//		- extends가 없는 class 는 extends Object가 생략되어 있다.
//		- toString() : 객체의 주소를 반환.
//		- equals() : 참조 변수의 값을 비교
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
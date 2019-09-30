
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
	
//		형변환
//		- primitive type
//		- int a = (int)3.12; : 강제 형변환
//		- double b = 3		 : 자동 형변환
	
//		다형성
//		부모 클래스 = 자식 클래스 : 자동 형변환
//		자식 클래스 = (자식 클래스) 부모 클래스 : 강제 형변환
	
	
	
	
//	===============================================
//	자주 쓰는 API(https://docs.oracle.com/javase/8/docs/api/index.html)
//	1. java.lang.Object
//		- Object는 모든 클래스의 부모(super)이다.
//		- extends가 없는 class 는 extends Object가 생략되어 있다.
//		- toString() : 객체의 주소를 반환.
//		- equals() : 참조 변수의 값을 비교
//		- hashcode() : 객체의 주소값을 10진수로 변경
	
//	2. java.lang.String
//		- 문자열을 다루는 클래스
//		- 문자열은 문자 배열
		
//		- equals() : 문자열이 같은지 비교
//		- length() : 문자열의 길이 리턴
//		- charAt() : Idex 번호를 매개 변수의 인자값으로 주면 해당 index 번호의 문자를 리턴
//		- indexOf() : 인자값으로 문자를 주면 해당 글자가 있는 인덱스 번호를 리턴
//		- subString() : 문자열의 일부분을 반환
//		- split() : 어떤 기준을 가지고 문자열을 파싱해서 문자열 배열(String[])에 담아 반환한다
//		- trim() : 맨 앞과 맨 뒤에 있는 white space를 제거 / 중간 x
//		- toLowerCase : 모든 문자열을 소문자로 변경
//		- toUpperCase : 모든 문자열은 대문자로 변경
//		- valueOf : 인자값을 String type으로 변경
//	3. java.lang.StringBuffer
//		- append() : 문자열 추가
//		- toString() : StringBuffer의 데이터를 문자열로 변환
//	4. Wrapper
//		- primitive type을 reference type으로 포장
//		- boolean - > Boolean
//		- int -> Integer
//		- char -> Character
//		- long - > Long
//		- 첫 글자를 대문자로 바꾼게 클래스명
//		- primitive -> reference : Auto Boxing
//		- reference -> primitive : Auto Unboxing
//		- 클래스명.parseXXX("문자열") : 문자열을 해당 데이터 타입으로 바꿈
//		
//		Double
//			- isNan : not a number : 숫자면 true 아니면 false
//			- isInfinite : 무한대면 true 아니면 false
//		Character
//			- isUpperCase : 대문자면 true 아니면 false
//			- isLowerCase : 소문자면 true 아니면 false
//			- isDigit	  : 숫자면 true 아니면 false
//			- isWhiteSpace(char) : 공백이면 true;
//	5. java.lang.math
//		- 모든 멤버가 static
//		- 객체 생성 X
//		- ceil() : 올림
//		- floor() : 내림
//		- round() : 반올림
//		- random() : 0.0 ~ 1.0 미만의 임의의 double 수
// -----------------------------------------------------
	
//	java.util
//	1. java.util.StringTokenizer
//		- 문자열을 파싱
//		- 생성자 매개변수
//			new StringTokenizer("자를 문자열","파싱 기준");
//		- hasMoreTokens	: 파싱할 문자열의 여부
//		- nextToken	: 실제 파싱
	
//	2. Collection
//		- Reference Type만 집합
//		- Auto Boxing, Auto Unboxing;
	
//		1) list
//			- 순서가 유지
//			- 값의 중복을 허용
//			- 배열기반
//			- ArrayList. Stack. Vector. LinkedList
//			- add(E) : 요소를 추가
//			- add(index, E) : 해당 인덱스 번호에 삽입
//			- set(index, E) : 해당 인덱스 번호의 요소를 수정
//			- get(index) : 해당 인덱스 번호의 요소를 리턴
//			- size() : 요소의 수를 리턴
//			- remove(Index) : 해당 인덱스 번호의 요소를 삭제
//			- clear() : 모든 요소를 삭제
		
//		2) Set
//			- 순서가 유지되지 않음	
//			- 값의 중복을 허용하지 않음
			
	
	
//		3) Map
//			- 키와 밸류
//			- 순서가 유지되지 않음
//			- 키의 중복은 허용되지 않고, 값의 중복 허용
//			- 키는 개발자가 직접 만들어줌
//			- HashMap, Properties....
//			- put(key, value) : 해당 키값으로 밸류를 맵에다가 저장
//			- get(key) : 해당 키로 밸류를 반환
//		- Iterator
//			- hasNext
//			- next
//		- Product
//			Tv
//			
//			Computer
//				
//				NoteBook
//		<? extends 부모형>
//		: 부모형과 부모를 상속받는 자식 타입으로 제한.
//		:<? extends Computer>
//		 - Computer, NoteBook
		
//		<? super 자식형>
//		: 자식형과 부모형으로 타입을 제한
//		: <? super Tv>
//		- Tv, Product
//	3. java.util.Random
//		- 무작위수 선정
//		- nextInt() : int 최소와 최대 범위 내에서 무작위수 리턴
//		- nextInt(int bound) : 0부터 bound 미만의 정수 하나를 무작위로 리턴
//	4. java.util.Calendar
//		- 날짜와 시간 다루는 클래스
//		- java.util.Date
//		-- 주요 변수
//		- AM_PM : 0이면 오전 1이면 오후
//		- Date : 오늘의 일
//		- Day_OF_Week : 요일
//		- DAY_OF_WEEK_IN_MONTH : 그 달의 주
	
//		-- 주요 메서드
//		- get(변수명)
//		- set(변수명, 값)
//		- set(년, 월, 일)
//		- roll(변수명, 값) : 변수의 값을 해당 값만큼 흐르게 함.
//		- add(변수명, 값) : 변수의 값을 해당 값만큼 흐르게 함.
//		- getTime() : 현재 시간을 Date 객체를 리턴
//		- setTime() : Data -> Calendar
//		- getTimeInMillis() : 현재 시간을 long 으로 변경(밀리세컨즈)
//		- setTimeInMillis() : long(밀리세컨즈)으로 현재 시간을 변경 (Calendar)
	
//	java.util.Date : 쓰지 말것을 권장
//	java.sql.Date : DB 연동
	
//	java.util.GregorianCalendar
//		- Calendar 클래스를 상속받아서 추상 메서드를 오버라이딩
//		- 대부분의 기능은 Calendar와 동일
//		- isLeapYear() : 윤년 여부를 판단...
	
//	5. 예외 처리
//		- error : 컴파일 에러
//		- exception : 실행시 발생하는 에러
//		- 목적 : 비정상적인 종료를 막고 정상적으로 실행될 수 있도록 유도
		
//		- 예외처리 방법
//		1) try {
//			예외가 발생할 코드
//		}catch() {
//			예외처리시 실행할 코드
//		}finally{
//			예외가 발생하든 말든 무조건 실행되야할 코드
//		}
		
//		- try 하나에 여러 개의 catch문 가능
		
//		2) 메서드의 선언부에
//		   throws 선언
//		- 예외가 발생하면 메서드를 호출한 쪼에서 예외 처리
	
//		3) 사용자 정의 Exception
//		클래스 생성시 Exception class 상속
	
//		NullPointerException
//		객체를 생성 안 했을때, 주로 나타남
//		NumberFormatException
//		문자열을 수자로 바꿀때 나타남
	
	
	
	
// -----------------------------------------------------
//		java.io
//		Input : 입력
//		Output : 출력
//		
//		기준 : 프로그램 기준
		
//		Stream : 연결 통로
		
//		Input, Output
	
//		InputStream : Byte 처리
//		
//		OutputStream : Byte 처리
	
//		Char
//		Read : InputStreamReader : char
	
//		Write : OutputStreamWriter : char
		
//	Byte -> 문자열
//	InputStream is = System.in;	//byte
//	InputStreamReader ir = new InputStreamReader(is); //char
//	BufferedReader br = new BufferedReader(ir); // String
//	String str = br.readLine();	//\n 만날때까지 한줄 읽어오기
	
//	2. File
//		- 파일의 정보를 저장하는 클래스
//		
//	3. FileReader
//		- 파일의 정보를 읽어오는 클래스
		
//		- new FileReader(파일의 경로명과 파일명) : File, String
//		- 보조 스트림 BufferedReader
//		- readLine() : 한 줄씩 읽기
//	4. FileWriter
//		- 파일에 내용을 작성하는 클래스
//		- new FileWriter(파일의 경로명, boolean 타입인 append)
//		- append
//		true - 기존의 파일이 없으면 새로 만들고, 있으면 이어쓰기
//		false - 내용을 지우고 덮어쓰기
		
//		flush() - 버퍼를 강제로 지우기
// -----------------------------------------------------
//	Network
//	
//	 server : Service 제공하는 자(것)
	
//	 client : Service 사용하는 자(것)
	
//	 Network 통신시 : Ipaddress, Port Number
	
//	TCP : 신뢰성 있는 연결, 안전한 데이터 중요시할 때
//		  요청을 보내면 응답이 와야 함 Request, Response
//	
//	UDP : 신뢰성 없는 연결, 속도를 중요시할 때
	
//	IP + Port : Socket
	
//	네트워크 통신은  Socket 간의 1:1 통신
		
//		Server : ServerSocket, Socket
//		
//		Client : Socket
// -----------------------------------------------------
//	Thread
//	
//	Thread는 가상의 stack를 생성
//	1. Thread Class 상속
//		- run 메서드 오버라이딩 : 개발자가 직접 호출 X
//		- run 메서드는 운영체제(OS)가 사용
//		- 실행시 start 메서드 호출
//		- start : OS에게 실행을 부탁
//	2. Runable Interface 구현
//		- run 메서드 오버라이딩
//		- Thread 클래스의 객체를 생성시 생성자의 매개변수의 값으로 전달
//		- Thread 클래스의 start 호출
//	3. 메서드 선언부에 synchronized 선언
//		- 멀티 쓰레드에서 synchronized 선언된 메서드는 한 사람만 실행
//	4. Dead Lock
//		- 
//	5. sleep - timeout
//	   wait  - notify
//	   yield - 
// -----------------------------------------------------
//	JDBC
//	1. DB 설치
//	2. DB
// -----------------------------------------------------
//	DATA BASE
//	1. Oracle, MySQL, Mssql, Berckly, etc. = 관계형 DB
//	   RDBMS
//	      엑셀과 비슷함
//	2. MongoDB, HBase, Casandra etc = NoSQL DB
	
//	Oracle 선택
//	1. 설치 - Oracle 11g Express Edition
//	2. 관리자
//		sys, sytem
//		비밀번호 생성
		
// -----------------------------------------------------
//	GitHub 연동
	
//	1. GitDesktop에서 WorkSpace 에 Repository 생성
//		- Repository 이름은 생성할 프로젝트 이름과 동일하게
//		- Git ignore 에 Java 선택
//	2. Eclipse 에서 프로젝트 생성
//		- 프로젝트명을 Repository와 동일하게
	
// -----------------------------------------------------
//	Virtual Box, VMWare
//	
//	1. 환경설정 - network
//		+ 새 네트워크 추가
//	2. 새로 만들기
//		저장할 폴더 지정
//		이름 지정
//		운영체제 지정
//		
//		램 크기 지정
//		하드디스크 크기 지정
//	3. network 클릭
//		어댑터 2 클릭
//		체크박스 체크
//		호스트 전용 어댑터 체크
		
//	-- NAT : 실제 네트워크 사용
//	-- 호스트전용어댑터 : Guest PC 와 Host PC 간의 통신
// -----------------------------------------------------

//	Java와 DB 연동
	
	
	
	
	
	
	
	
	
	
	
}

package co.kgggy.prj;

public class MainApp {
	public static void main(String[] args) {
//		//hellojava 클래스 생성(인스턴스 만듦). 만든 클래스 초기화.
//		HelloJava helloJava = new HelloJava(); //class를 생성, 인스턴스 한개를 생성함.
//		helloJava.setStr("안녕!"); //Setter를 통해 값을 주입.
//		helloJava.toString();
//		
//		System.out.println(helloJava.getStr() + "!~!~!~~~"); //Getter를 통해 값을 주입.

//		IfTest ifTest = new IfTest(); // 사용할 클래스를 초기화한다.(인스턴스 한개 생성) (String str = "aaaa";(변수 초기화)와 같은 의미.)
//		// IfTest/String => 타입(stack영역에 올라옴) //ifTest/str =>인스턴스(변수)(heap영역에 올라옴)
//		HelloJava helloJava = new HelloJava("If 연습인가요?");
//		ifTest.simpleIf();
//		helloJava.toString();
//		ifTest.ifElseIf();
//
//		ifTest.ifElseTest();
//
//		ForTest forTest = new ForTest();
//		forTest.singleFor();
//		//void 수행 결과보고 하지 않음(돌려줄 결과 없음, return타입없음)
//		//boolean 참, 거짓으로 결과 보고함
//		forTest.doubleFor();
//		forTest.forEach();

		
		MenuTest mainMenu = new MenuTest();
		mainMenu.run();
	}
}

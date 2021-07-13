package co.kgggy.prj;

public class HelloJava {
	// private는 생성자를 통해, setter를 통해 전달할 수 있음.
	private String str; // 멤버 변수.(공개되지 않음)

	public HelloJava() { // 기본생성자.(default)
	}

	public HelloJava(String str) { // 전달인자를 가진 생성자   동일한 생성자에 전달인자만 다름 => 다형성(생성자 오버로딩)
		this.str = str;
	}

	public String getStr() { // 같은타입의 리턴밸류 필요함.(기억된 값을 가져옴)
		return str;
	}

	public void setStr(String str) { // 전달인자 있어야함.(값을 기억시킴)
		this.str = str;
	}

	@Override //메소드 본체를 내가 만드는것.
	public String toString() { //Object객체로 상속받은 toString 메소드를 재정의함.
		//오버로딩 > 전달인자, 메소드가 다름
		//오버라이딩 > 본체를 내가 만들어줌.
		System.out.println(str);
		return null;
	}

	//1. 모든 class는 main() 만들지 않는다.
	//2. main()은 MainApp class에만 만든다.
	//3. project 내에서 MainApp은 하나만 존재한다.
	//4. class 안에 class를 만들지 않는다.
}

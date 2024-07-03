package re_nested_class_interface3;

public class Outter {
	public void method2(int arg) {
		int localVa = 9999; // 여기에 final이 생략되어 있어서 localVa 값을 변경하면 안된다는 거구나 
//		arg = 100;
//		localVa = 100;   컴파일 오류는 안 뜨지만 이렇게 하면 안 된다는 건가? >> okok 
		class Inner {
			public void method() {
				int result = arg + localVa;
			}
		}
	}
}

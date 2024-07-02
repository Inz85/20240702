package re_nested_class_interface3;

public class Outter2 {
	String field = "Outter field 이시다";
	void method() {
		System.out.println("Outter method 올시다");
	}
	
	class Nested {
		String field = "Nested field 란다";
		void method() {
			System.out.println("Nested method 올시다");
		}
		
		void print() {
			System.out.println(this.field);
			this.method(); // 중첩Nested 객체 참조
			
			System.out.println(Outter2.this.field);
			Outter2.this.method(); // 바깥Outter 객체 참조
		}
	}

}

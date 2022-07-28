package NestedClass3;

public class A {
	
	//인스턴스 필드
	B field1 = new B();     // <--- O
	C field2 = new C();     // <--- O
	
	//인스턴스 메소드
	void method() {
		B var1 = new B();  // <--- O
	    C var2 = new C();  // <--- O
	}
    
	 //정적 필드 초기화
	static C field4 = new C();   // <--- O
	
	
	
	static void method2() {
		//B var1 = new B();  // <--- X
		C var2 = new C();    // <--- O
		
	}
	//인스턴스 멤버 클래스
	class B { }
	//정적 멤버 클래스
	static class C{ }
}

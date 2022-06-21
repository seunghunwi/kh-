package NestedClass1;

public class A {
	A() {System.out.println("A 객체를 생성함"); }
	
	public class B {
		B(){System.out.println("B 객체를 생성함");}
		int field1;
		//static int field2;
		void method() {}
		//staticd void method2() {}
		
		
	}
		
		static class C {
			C() { System.out.println("C 객체를 생성됨");}
			int field1;
			static int field2;
			void method() {}
			static void method2() {}
			}
			
			
		
			void method() {
				//로컬 클래스
				
				class D {
					D() {System.out.println("D 객체를 생성함");}
					int field1;
					//static int field2;
					void method1() {}
					//static void method(){}
					
					}
					D d= new D();
					d.field1 = 3;
					d.method1();
				
					
				}
			}
		
	
	
	



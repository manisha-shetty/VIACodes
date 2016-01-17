package com.corejava.module7;
//7. 


abstract class AbstractClass{
		void hello(){
			System.out.println("I am Anonymous Class using Abstract Class");
		}
}

interface Interface{
	void hello();
}

public class TestNestedClass {

	
	public int x = 0;
	 static class StaticNestedClass{
		void getData(){
			System.out.println("I am in static nested class");

		}
	 }
	 
    class NonStaticInnerClass {
        public int x = 1;
 
        void methodInFirstLevel(int x) {
        	class NonStaticLocalInnerClass{
        		void methodInSecondLevel(){
        			System.out.println("I am in Second Level");
           		}
        	}        	
        	NonStaticLocalInnerClass local=new NonStaticLocalInnerClass();
        	local.methodInSecondLevel();
        	 
        	System.out.println("I am in First level");
        	System.out.println("x = " + x);
        	System.out.println("this.x = " + this.x);
        	System.out.println("TestNestedClass.this.x = " + TestNestedClass.this.x);
        }
    }
 
    public static void main(String... args) {
    	TestNestedClass st = new TestNestedClass ();
    	TestNestedClass.NonStaticInnerClass fl = st.new NonStaticInnerClass();
        fl.methodInFirstLevel(23);
        
    	TestNestedClass.StaticNestedClass nested= new TestNestedClass.StaticNestedClass();
    	nested.getData();

    	
    	AbstractClass a=new AbstractClass() {};
    	a.hello();
    	
    	Interface i=new Interface() {
			
			@Override
			public void hello() {
					System.out.println("I am an anonymous class using interface");
			}
		};
		i.hello();
    }

}

package day0831.spring.DI;

public class Foo {
	
	public void start(){
		System.out.println("init메서드");
	}
	
	public void stop(){
		System.out.println("destory메서드");
	}
	
	Bar bar;
	Baz baz;
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}

	Foo(){}
	
	String str;
	int i;
	
/*	String s1;
	String s2;*/
	
	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

	void doFoo(){
		//bar = getBar();
		System.out.println("str :"+str+" i :"+i);
		bar.doIt();
	}

/*	public Bar getBar(){
		return null;//Bar타입의 bean을 리턴할수 있도록 오버라이딩 됨.
	}*/
	
	Foo(String str, int i){
		this.str = str;
		this.i = i;
		System.out.println("str:::"+str+i);
	}
	
/*	Foo(String s1, String s2){
		System.out.println("String, String::"+s1+s2);
	}*/
	
	Foo(Bar bar, Baz baz){
		System.out.println("Bar bar, Baz baz");
		this.bar = bar;
		this.baz = baz;
	}

}

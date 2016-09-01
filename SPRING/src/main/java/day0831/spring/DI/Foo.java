package day0831.spring.DI;

public class Foo {
	
	public void start(){
		System.out.println("init�޼���");
	}
	
	public void stop(){
		System.out.println("destory�޼���");
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
		return null;//BarŸ���� bean�� �����Ҽ� �ֵ��� �������̵� ��.
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

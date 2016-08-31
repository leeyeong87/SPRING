package spring.DI.day0831;

public class Foo {
	
	Bar bar;
	Baz baz;
	
	String str;
	int i;
	
	String s1;
	String s2;
	
	void doFoo(){
		bar.doIt();
	}
	
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

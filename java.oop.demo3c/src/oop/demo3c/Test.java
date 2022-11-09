package oop.demo3c;


class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}

class C extends B{
	public C() {
		System.out.println("C");
	}
}

class D extends A{
	public D() {
		System.out.println("D");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new B();
		C c = new C();
	}
}

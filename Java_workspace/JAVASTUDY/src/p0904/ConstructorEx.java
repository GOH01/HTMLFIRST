package p0904;
class A {
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자A"+x);
	}
}
class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		super(x);
		System.out.println("매개변수 생성자B"+x);
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		B b;
		b=new B(5);
	}

}

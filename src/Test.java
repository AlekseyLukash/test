import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test extends AA {
	public int q = 1;
	public static void justDoIt(Short num) {
		System.out.println("shor");
	}

	public static void justDoIt(Long num) {
		System.out.println("Long");
	}

	public static void justDoIt(Double num) {
		System.out.println("Double");
	}

	public static void justDoIt(int num) {
		System.out.println("int");
	}
	
	public static void justDoIt(Integer num) {
		System.out.println("Integer");
	}
	
	public static void justDoIt(Number num) {
		System.out.println("Number");
	}

	public static void justDoIt(String num) {
		System.out.println("String");
	}

	public static void justDoIt(Object num) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		short s = 10000;
		byte b = 5;
		float f = 21312F;
		Integer i = new Integer(5);
		
		 justDoIt(5);
		// justDoIt(s);
		// justDoIt(f);
		// justDoIt(i);
		// justDoIt(b);
		// justDoIt("sdsds");

//		A a = new D();
//		if (a instanceof A) System.out.println("a");
//		if (a instanceof D) System.out.println("D");
//		if (a instanceof B) System.out.println("B");
//		if (a instanceof C) System.out.println("C");
		
		Set<Studet> set = new HashSet<>();
		set.add(new Studet(5));
		set.add(new Studet(1));
		set.add(new Studet(7));
		set.add(new Studet(1));
		System.out.println(set.size() + " size");
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(1);
		
		for (Integer integ : al) {
			System.out.print(integ + " ");
		}
		
		AA aa = new AA();
		Test test = new Test();
		AA at = new Test();
		System.out.println();
		System.out.print(aa.q);
		System.out.print(test.q);
		System.out.print(((AA) test).q);
		System.out.print(at.q);
		System.out.println();
		boolean b1 = true;
		int x = 0;
		do {
			if(x++ > 5) {
				b1 = false;
			}
			System.out.print(x);
		} while (b1);
	}
}

interface A{}
interface B{}
class C implements A{}
class D extends C implements B {}

class Studet{
	private int mark;
	public Studet(int mark) {
		this.mark = mark;
	}
	
//	public int hashCode() {
//		return 10;
//	}
//	public boolean equals(Object args) {
//		return true;
//	}
}

class AA{
	public int q = 2;
}
package com.driver;
public class A {
	public String meth(){
		return "Invoking method from class A";
	}
}
public class B extends A{
	public String meth(){

		return "Method is overridden in Extendend class B";
	}

}

class Main {

	public static void main(String [] args){
		B obj = new B();
		System.out.println(obj.meth());
	}
  
}

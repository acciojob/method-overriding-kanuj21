package com.driver;
class A {

}
class B extends A{
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

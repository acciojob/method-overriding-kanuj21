package com.driver;


class B extends A {
	public String meth(){
		return "Method is overridden in Extendend class B";
	}


	public static void main(String [] args){
		B obj = new B();
		System.out.println(obj.meth());

	}
  
}

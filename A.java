class A{
  String meth(){
    return "Invoking method from class A"; 
  }
}

class B extends A{
	String meth(){
		return "Method is overridden in Extendend class B";
	}
	public static void main(String [] args){
		B obj = new B();
		System.out.println(obj.meth());
	}
}

package acessmodifier;
public class protacted {
protected void msg(){System.out.println("Hello");}  
	}  
	package acessmodifier;  
	  
	class B extends protacted{  
	  public static void main(String args[]){  
	   B obj = new B();  
	   obj.msg();  
	  }  
	}  



package inheritance;

public class hierarchical {
	   void eat(){System.out.println("eating...");}  
		}  
		class Dog extends hierarchical{  
		void bark(){System.out.println("barking...");}  
		}  
		class Cat extends hierarchical{  
		void meow(){System.out.println("meowing...");}  
		}  
		class TestInheritance3{  
		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		 }}  

		
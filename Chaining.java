/* 4.4 Assignment: Program to demonstrate Constructor chaining in Java. 
   Access super class constructor through child class and 
   display the relevant statements of both.
*/


class GrandParent {
	public GrandParent() {
		System.out.println("GrandParent class constructor executed");
	}
}

class Parent extends GrandParent {
	public Parent() {
		super();	// this statement will execute contructor of GrandParent class.
		System.out.println("Parent class constructor executed");
	}
}

class Child extends Parent {
	public Child() {
		super();	// this statement will execute contructor of parent class.
		System.out.println("Child class constructor executed");
	}
}

class Chaining {
	public static void main(String[] args)
	{
		Child ch = new Child();	// object ch created of Child class and constructor Child initiated.
	}
}

//End of program
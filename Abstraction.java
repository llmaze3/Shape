abstract class Shape{


	String color;
	//abstract method will be defined later in subclasses 
	abstract double area();
	public abstract String toString();
	
	//constructor  
	public Shape(String color){
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	//concrete method
	public String getColor(){
		return color;
	}
	
}

class Circle extends Shape{
	double radius;
	public Circle(String color, double radius){
		super(color);
		System.out.println("Circle constructor called");
		//call shape constructor 
		this.radius = radius;
	}
	//Polymorphism; hide this method from the parent using override
	@Override
	double area(){
		return Math.PI * Math.pow(radius, 2);
	} 
	@Override
	public String toString(){
		return "Circle color is " + super.color + "and the radius is " + area();
	}
	
}


public class Abstraction{
		public static void main(String args[]){
			//Virtual Method Invocation
			Shape s1 = new Circle("red", 4);
			System.out.println(s1.toString());
		} 
		
}
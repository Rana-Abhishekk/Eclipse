
class Vehicle{
	int wheels;
	int doors;
	Vehicle(){
		System.out.println("You are in Vehicle class");
	}
	Vehicle(int wheels,int doors){
		this.wheels = wheels;
		this.doors = doors;
		System.out.println("wheels and door of vehicle are : "+ this.wheels + " " + this.doors);
		
	}
}

class Bike extends Vehicle{ // inheritance
	
	int speed;
	Bike(){
		// super(4,4); // flow goes to the parent class
		this(50); //--> this() method being used to call a constructor from constructor 
		System.out.println("This is a bike");
	}
	Bike(int speed){
		super(8,8);
		this.speed = speed;
		System.out.println("This is a bike's speed : " + this.speed);
		
	}
	
}

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike(); 
		//Bike bike1 = new Bike();
		bike.wheels = 4; // using inheritance
		bike.doors = 0;
		//System.out.println("wheels in bike are :" + bike.wheels);
		//System.out.println("doors in bike are :" + bike.doors);
		//System.out.println("doors in bike are :" + bike1.doors);
		

	}

}

package testes.defaultsInterface;

public class Java8Tester {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

interface Vehicle {
	
	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn!!");
	}
}

interface FourWheeller {
	
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeller{
	
	public void print() {
		Vehicle.super.print();
		FourWheeller.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}	
}

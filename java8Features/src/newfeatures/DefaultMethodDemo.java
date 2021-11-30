package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		Vehicle car = new Car("BMW");
		
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		
		// invoking default methods
		System.out.println(car.turnAlarmOn());
		
		
		// invoking static method
		System.out.println(Vehicle.getHorsePower(2500,400));

	}

}

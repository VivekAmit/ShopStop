package newfeatures;

public interface Vehicle {
	String getBrand();
	String speedUp();
	String slowDown();
	
	// any non abstract method should be default

	 default String turnAlarmOn() {         // error without default keyword and < java 8
		return "Turning on the Alarm";
	}
	 default String turnAlarmOff() {         // error without default keyword and < java 8
			return "Turning off the Alarm";
	}
	 
	 static int getHorsePower(int rpm , int torque ) {// error without static keyword
		 return (rpm*torque)/5252;
	 }
}

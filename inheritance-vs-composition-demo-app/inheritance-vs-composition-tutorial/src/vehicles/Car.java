package vehicles;

public class Car extends Vehicle {
	String licensePlateNumber;
	String owner;
	String bodyStyle;
	
	public static void main(String... inheritanceExample) {
		System.out.println(new Vehicle().brand);
		System.out.println(new Car().brand);
		new Car().move();
	}
}

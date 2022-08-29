package composition;

public class CompositionExample {

	public static void main(String... houseComposition) {
		House houseObj = new House(new Bedroom(), new LivingRoom());
		// The houseObj now is composed with a Bedroom and a LivingEoom
	}
}

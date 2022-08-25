package composition;

public class House {
	
	Bedroom bedroom;
	LivingRoom livingRoom;
	
	House(Bedroom bedroom, LivingRoom livingRoom) {
		this.bedroom = bedroom;
		this.livingRoom = livingRoom;
	}	
}

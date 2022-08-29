package superKeyWordExample;

class Moe extends Character {
	// Accessing constructor
    Moe() {
        super();
    }
    void giveBeer() {
    	// Accessing method
        super.move();
        System.out.println("Give beer");
    }
    
    public static void main(String... superExample) {
    	Moe moe = new Moe();    	
    	moe.giveBeer();
	}
}

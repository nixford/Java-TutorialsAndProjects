package superKeyWordExample;

class Moe extends Character {
    Moe() {
        super();
    }
    void giveBeer() {
        super.move();
        // System.out.println("Give beer");
    }
    
    public static void main(String... superExample) {
    	Moe moe = new Moe();
    	
    	moe.giveBeer();
	}
}

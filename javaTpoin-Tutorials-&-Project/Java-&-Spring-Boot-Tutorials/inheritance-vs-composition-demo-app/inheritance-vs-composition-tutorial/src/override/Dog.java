package override;

class Dog extends Animal {
	
	@Override
	void emitSound() {
		System.out.println("Dog sound");
	}
	
	public void bark( ) {
		System.out.println("Barking");
	}
}



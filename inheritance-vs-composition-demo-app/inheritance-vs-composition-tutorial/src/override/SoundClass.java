package override;

public class SoundClass {
	public static void main(String... overrideExample) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal animal = new Animal();
		
		cat.emitSound();
		dog.emitSound();
		animal.emitSound();
	}

}

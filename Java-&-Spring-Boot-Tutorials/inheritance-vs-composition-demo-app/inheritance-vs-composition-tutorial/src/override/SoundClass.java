package override;

public class SoundClass {

	public static void main(String... overrideExample) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal animal = new Animal();
		
		cat.emitSound();
		dog.emitSound();
		
		// If we want to use method which is specified only in the subclass
		// we should cast the "dog" object, because the "Animal" doesn't know the "bark()" method 
		Dog otherDog = (Dog)dog;
		otherDog.bark();
		
		animal.emitSound();
	}

}

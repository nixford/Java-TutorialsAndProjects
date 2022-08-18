package superContructorFirsLoading;

public class Barney extends Character {
    // No need to declare the constructor or to invoke the super constructor
	// The super class constructor is invoked first
    // The JVM will to that
	
	
	// If the parent class has a constructor with at least one parameter, 
    // then we must declare the constructor in the subclass and use 
    // super to explicitly invoke the parent constructor, for example:
	
	//	Barney() {
	//     super("Barney Gumble");
	//  }
} 

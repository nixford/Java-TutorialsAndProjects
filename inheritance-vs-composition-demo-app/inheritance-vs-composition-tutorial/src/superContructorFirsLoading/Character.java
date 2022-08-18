package superContructorFirsLoading;

public class Character {
    Character() {
        System.out.println("The super constructor was invoked");
    }
    
    // If the parent class has a constructor with at least one parameter, 
    // then we must declare the constructor in the subclass and use 
    // super to explicitly invoke the parent constructor, for example:
    
	//    Character(String name) {
	//        System.out.println(name + "was invoked");
	//    }
}

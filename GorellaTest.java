package classes;

public class GorellaTest {

	public static void main(String[] args) {
		// Instantiate Gorilla
		Gorilla one = new Gorilla();
		
		//display the energy level at the start
		one.getEnergyLevel();
		
		//have it throw three things, eat bananas twice, and climb once.
		one.throwStuff();
		one.throwStuff();
		one.throwStuff();
		
		one.eatBanana();
		one.eatBanana();
		
		one.climb();
		
		//display the energy level after all this
		one.getEnergyLevel();
	}

}

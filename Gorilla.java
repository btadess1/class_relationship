package classes;

public class Gorilla extends Mamal{
	
	public void throwStuff(){
		this.energyLevel -=5;
		System.out.println("The Gorilla has thrown a rock");
	}
	
	public void eatBanana(){
		this.energyLevel += 10;
		System.out.println("The Gorilla is happy after eating the bananas!");
	}
	
	public void climb(){
		this.energyLevel -=10;
		System.out.println("THe Gorilla has climed the tree");
	}
}

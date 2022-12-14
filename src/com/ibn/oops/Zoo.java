package com.ibn.oops;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Lion extends Animal {
	public void animalSound() {
		System.out.println("The Loin roar");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

public class Zoo {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		myAnimal.animalSound(); // The animal makes a sound
		
		Animal myLion = new Lion(); // Create a Lion object
		myLion.animalSound(); // The Loin roar
		
		Animal myDog = new Dog(); // Create a Dog object
		myDog.animalSound(); // The dog says: bow wow
	}
}

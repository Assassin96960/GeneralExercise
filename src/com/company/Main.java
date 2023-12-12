package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog= new Dog();
        Cat cat = new Cat();
        Frog frog= new Frog();
        AnimalHouse<Animal> animalHouse= new AnimalHouse<>();
        animalHouse.setAnimal(cat);
        animalHouse.setAnimal(dog);
        animalHouse.setAnimal(frog);
        animalHouse.animal=dog;
        animalHouse.animal=frog;
        AnimalHouse<Dog> dogHouse= new AnimalHouse<>();
        dogHouse.setAnimal(dog);
        AnimalHouse<Frog> frogHouse= new AnimalHouse<>();
        frogHouse.setAnimal(frog);
        AnimalHouse<Cat> catHouse= new AnimalHouse<>();
        catHouse.setAnimal(cat);
    }
}

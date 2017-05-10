package com.company;

import com.company.animals.Dog;
import com.company.interfaces.Audible;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.init();
        zoo.runAnimalsByObjectRef();
        System.out.println();
        zoo.runAnimalsByInterfaceRef();
        System.out.println();
        zoo.hideAnimalsByInterfaceRef();
        System.out.println();
        zoo.makeNoiseAnimalsByInterfaceRef();

		Audible someAnimal = zoo.getAudibles().get(0);

		Dog myDog = (Dog)someAnimal;// casting
		myDog.run();
		//System.out.println(someAnimal.getClass().getCanonicalName());
    }
}

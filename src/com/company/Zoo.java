package com.company;

import com.company.animals.Dog;
import com.company.animals.Elephant;
import com.company.animals.Snake;
import com.company.interfaces.Audible;
import com.company.interfaces.Movable;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-10.
 */
public class Zoo {

	private ArrayList<Dog> dogs = new ArrayList<>();
	private ArrayList<Elephant> elephants = new ArrayList<>();
	private ArrayList<Snake> snakes = new ArrayList<>();

	private ArrayList<Movable> movables = new ArrayList<>();
	private ArrayList<Audible> audibles = new ArrayList<>();

	public ArrayList<Movable> getMovables() {
		return movables;
	}

	public ArrayList<Audible> getAudibles() {
		return audibles;
	}

	public void setMovables(ArrayList<Movable> movables) {
		this.movables = movables;
	}

	public void setAudibles(ArrayList<Audible> audibles) {
		this.audibles = audibles;
	}

	public void init() {

		Dog dog = new Dog();
		dogs.add(dog);

		Elephant elephant = new Elephant();
		elephants.add(elephant);

		Snake snake = new Snake();
		snakes.add(snake);

		movables.add(dog);
		movables.add(elephant);
		movables.add(snake);
		audibles.add(dog);
		audibles.add(elephant);
		audibles.add(snake);
	}

	public void runAnimalsByObjectRef() {

		for (Dog dog : dogs) {
			dog.run();
		}
		for (Elephant elephant : elephants) {
			elephant.run();
		}
		for (Snake snake : snakes) {
			snake.run();
		}
	}

	public void runAnimalsByInterfaceRef() {
		for (Movable movable : movables) {
			movable.run();
		}
	}

	public void hideAnimalsByInterfaceRef() {
		for (Movable movable : movables) {
			movable.hide();
		}
	}

	public void makeNoiseAnimalsByInterfaceRef() {
		for (Audible audible : audibles) {
			audible.makeNoise();
		}
	}
}

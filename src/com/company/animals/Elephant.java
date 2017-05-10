package com.company.animals;

import com.company.interfaces.Audible;
import com.company.interfaces.Movable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Elephant implements Movable, Audible{
	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName() + ": I'm running");
	}

	@Override
	public void hide() {
		System.out.println(this.getClass().getSimpleName() + ": I'm hiding");
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getClass().getSimpleName() + ": I'm making noise");
	}
}


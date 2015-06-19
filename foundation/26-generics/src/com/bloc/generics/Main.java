package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/
		
		Thing thing1 = new ActionFigure();
		Thing thing2 = new Book();
		Thing thing3 = new Spoon();
		
		Toy<Thing> toy1 = new Toy(thing1);
		Toy<Thing> toy2 = new Toy(thing2);
		Toy<Thing> toy3 = new Toy(thing3);
		
		toyBox.addToy(toy1);
		toyBox.addToy(toy2);
		toyBox.addToy(toy3);
		
//		// Alternative way?
//		
//		toyBox.addToy(new Toy(new ActionFigure()));
//		toyBox.addToy(new Toy(new Book()));
//		toyBox.addToy(new Toy(new Spoon()));
		
		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}

}

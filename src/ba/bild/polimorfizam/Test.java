package ba.bild.polimorfizam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Animal animal;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 1 za macku, 2 za psa");

		int korisnikovUnos = input.nextInt();

		input.close();

		if (korisnikovUnos == 1) {
			animal = new Cat();

		} else {
			animal = new Dog();

		}

		animal.jedi();
		animal.oglasavanje();

	}

}

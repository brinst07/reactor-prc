package org.brinst;

public class Main {
	public static void main(String[] args) {
		Publisher publisher = new Publisher();
		System.out.println("Hello world!");
		// publisher.startFlux().subscribe(System.out::println);

		publisher.startMono().subscribe();
		publisher.startMono2().subscribe();
	}
}

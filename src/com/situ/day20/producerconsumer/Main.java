package com.situ.day20.producerconsumer;

public class Main {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		ConsumerThread consumerThread = new ConsumerThread("ConsumerThread", panzi);
		consumerThread.start();
		ProducerThread producerThread = new ProducerThread("ProducerThread", panzi);
		producerThread.start();
	}
}

package com.situ.day20.producerconsumer;

public class MainTest {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		ConsumerThread consumerThread = new ConsumerThread("Consumer", panzi);
		consumerThread.start();
		ProducerThread producerThread = new ProducerThread("Producer", panzi);
		producerThread.start();
	}
}

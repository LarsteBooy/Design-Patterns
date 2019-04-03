package com.larstebooy.concurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@SpringBootApplication
public class JmeteroefeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmeteroefeningApplication.class, args);

		System.out.println("\n=======Completeable Future=======");

		Executors.newCachedThreadPool().submit(() -> taakje().thenAccept(name -> System.out.println("Hallo, " + name)));

	}

	public static CompletableFuture<String> taakje() {
		return CompletableFuture.supplyAsync(() -> {

			String name = "Poepjannes";

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return name;
		});
	}

}

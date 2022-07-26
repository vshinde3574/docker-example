package com.dockerexample.dockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);

		List<PubSub> list = new ArrayList<>();
		list.add(new PubSub("xyz", "id4", "01"));
		list.add(new PubSub("pqr", "id2", "01"));
		list.add(new PubSub("abc", "id3", "01"));

		list.sort(new Comparator<PubSub>() {
			@Override
			public int compare(PubSub o1, PubSub o2) {
				return o1.getData().compareTo(o2.getData());
			}
		});
		list.stream().forEach(o -> System.out.println(o.getData()));


		list.stream().sorted((o1, o2) -> o1.getMessageId().compareTo(o2.getMessageId())).forEach(o->System.out.println(o.getMessageId()));
	}

}

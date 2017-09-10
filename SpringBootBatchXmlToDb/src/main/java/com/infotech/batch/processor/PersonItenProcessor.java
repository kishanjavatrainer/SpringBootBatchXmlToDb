package com.infotech.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.infotech.batch.model.Person;

public class PersonItenProcessor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person person) throws Exception {
		return person;
	}
}

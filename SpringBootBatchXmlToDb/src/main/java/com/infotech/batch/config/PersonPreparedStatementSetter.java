package com.infotech.batch.config;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.infotech.batch.model.Person;

public class PersonPreparedStatementSetter implements ItemPreparedStatementSetter<Person> {

	@Override
	public void setValues(Person person, PreparedStatement ps) throws SQLException {
		ps.setInt(1, person.getPersonId());
		ps.setString(2, person.getFirstName());
		ps.setString(3, person.getLastName());
		ps.setString(4, person.getEmail());
		ps.setInt(5, person.getAge());
	}

}

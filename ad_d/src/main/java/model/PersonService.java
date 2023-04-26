package model;

import java.util.List;

import model.Person;

public interface PersonService {
	
	 Person create(final Person person);
	 Person findById(final String personId);
	 List<person> findAll();
	 Person update(Person person);
	 void delete(final String personId);
	 

}

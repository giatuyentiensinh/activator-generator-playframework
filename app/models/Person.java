package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Person extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	public String fristname;

	public String lastname;
	
	public Integer age;
	
	private static final Finder<Long, Person> finder = new Finder<Long, Person>(
			Long.class, Person.class);

	public static Person findByName(String name) {
		return finder.where().eq("name", name).findUnique();
	}
	
	public static Integer countPerson() {
		return finder.findRowCount();
	}

	public static List<Person> findAll() {
		return finder.all();
	}
}

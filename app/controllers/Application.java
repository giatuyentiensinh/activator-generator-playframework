package controllers;

import models.Person;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result showPerson() {
		return ok(Json.toJson(Person.findAll()));
	}

}

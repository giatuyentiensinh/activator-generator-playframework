package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class Application extends Controller {

	public static Result data() {
		ObjectNode node = Json.newObject();
		node.put("fristname", "Tuyen");
		node.put("lastname", "Nguyen Gia");
		node.put("age", 21);
		return ok(node);
	}

}

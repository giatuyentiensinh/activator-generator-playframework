import models.Person;
import play.Application;
import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		Logger.info("Start application ...");
		if (Person.countPerson() == 0)
			initData();
		super.onStart(app);
	}

	private static void initData() {
		Person person = new Person();
		person.fristname = "Tuyen";
		person.lastname = "Nguyen Gia";
		person.age = 21;
		person.save();
		person = new Person();
		person.fristname = "Dinh";
		person.lastname = "Tuan";
		person.age = 21;
		person.save();
	}

	@Override
	public void onStop(Application app) {
		Logger.info("Stop applicaton !");
		super.onStop(app);
	}
}

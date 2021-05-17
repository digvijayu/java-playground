package hello;

import org.joda.time.LocalTime;

public class Greeter {
	public String sayHello() {
		return "Hi there" + new LocalTime();
	}
}

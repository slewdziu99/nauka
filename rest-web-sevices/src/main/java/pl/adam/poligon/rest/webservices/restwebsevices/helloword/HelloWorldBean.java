package pl.adam.poligon.rest.webservices.restwebsevices.helloword;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return super.toString();
		//return String.format("HelloWorldBean [message=%s]", message);
	}

}

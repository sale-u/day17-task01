package domain;

public class Budgie implements Birds {
	
	private final String name;

	public Budgie(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void sayHello() {

		System.out.println("Budgie " + getName() + " chirps!");

	}

}

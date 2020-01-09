package creational.FactoryMethod._03;

public interface IAnimal {
	public void walk();

	public void eat();
}

class Duck implements IAnimal {

	@Override
	public void walk() {
		System.out.println("Duck walk");
	}

	@Override
	public void eat() {
		System.out.println("Duck eat");
	}

}

class Tiger implements IAnimal {

	@Override
	public void walk() {
		System.out.println("Tiger walk");
	}

	@Override
	public void eat() {
		System.out.println("Tiger eat");
	}

}
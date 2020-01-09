package creational.FactoryMethod._03;

public class Client {
	public static void main(String[] args) throws Exception {
		IAnimal duck = new ConcreteFactory().getAnimal("DUCK");
		duck.eat();
		
		IAnimal tiger = new ConcreteFactory().getAnimal("TIGER");
		tiger.eat();
		
		IAnimal lion = new ConcreteFactory().getAnimal("LION");
		lion.eat();
	}
}

package creational.FactoryMethod._03;

public abstract class AbsFactoryAnimal {
	public abstract IAnimal getAnimal(String type) throws Exception;
}

class ConcreteFactory extends AbsFactoryAnimal {
	@Override
	public IAnimal getAnimal(String type) throws Exception {
		
		switch (type) {
		case "DUCK":
			return new Duck();
			
		case "TIGER":
			return new Tiger();
		default:
			throw new Exception("Can not be create!!!");
		}
	}
}

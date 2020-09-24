public class ZooKeeper {
	public void feed(Predator predator) {
		System.out.println(predator +  "eat " + predator.getFood());
	}
	public void feed(HousePet housepet) {
		System.out.println(housepet + " eat " + housepet.getFood());
	}

	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Dog dog = new Dog();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(dog);
	}
}
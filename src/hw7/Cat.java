package hw7;

public class Cat extends Animal {//繼承父類別Animal，實作抽象方法，且因父類別Animal實作序列化，子類別不需再做
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}

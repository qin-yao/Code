package lzy;
//定义抽象类
abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{
	void shout(){
		System.out.println("汪汪...");
	}
}
public class Example10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.shout();

	}

}

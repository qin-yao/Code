package lzy;
//使用super关键字调用父类的构造方法
//class Animal{
	public Animal(String name){
		System.out.println("我是一只"+name);
	}
}
//class Dog extends Animal{
	public Dog(){
		super("沙皮狗");
	}
}
public class Example04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		

	}

}

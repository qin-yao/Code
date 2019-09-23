package lzy;
//接口
interface Animal{
	int ID=1;
	void breath();
	void run();
}
class Dog implements Animal{
	public void breath(){
		System.out.println("狗在呼吸");
	}
	public void run(){
		System.out.println("狗在跑");
	}
}
public class Example11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.breath();
		dog.run();

	}

}

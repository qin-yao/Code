package lzy;
//�����޲εĹ��췽��
class Animal{
	public Animal(){
		System.out.println("����һֻ����");
	}
	public Animal(String name){
		System.out.println("����һֻ"+name);
	}
}
class Dog extends Animal{
	public Dog(){
		
	}
}
public class Example05 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog dog=new Dog();

	}

}

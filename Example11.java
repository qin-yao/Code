package lzy;
//�ӿ�
interface Animal{
	int ID=1;
	void breath();
	void run();
}
class Dog implements Animal{
	public void breath(){
		System.out.println("���ں���");
	}
	public void run(){
		System.out.println("������");
	}
}
public class Example11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog dog=new Dog();
		dog.breath();
		dog.run();

	}

}

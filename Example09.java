package lzy;
//final修饰成员变量
class Student{
	final String name;
	public void introduce(){
		System.out.println("我是一个学生，我叫"+name);
	}
}
public class Example09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu=new Student;
		stu.introduce();

	}

}

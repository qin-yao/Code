
public class zuoye {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Techer t=new Techer();
		new Thread(t,"陈老师").start();
		new Thread(t,"高老师").start();
		new Thread(t,"李老师").start();
	}

}

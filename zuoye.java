
public class zuoye {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Techer t=new Techer();
		new Thread(t,"����ʦ").start();
		new Thread(t,"����ʦ").start();
		new Thread(t,"����ʦ").start();
	}

}

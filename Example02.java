
public class Example02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TicketWindow02 tw=new TicketWindow02();
		new Thread(tw,"����һ").start();
		new Thread(tw,"���ڶ�").start();
		new Thread(tw,"������").start();
		new Thread(tw,"������").start();

	}

}

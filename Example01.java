
public class Example01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TicketWindow tw=new TicketWindow();
		new Thread(tw,"����һ").start();
		new Thread(tw,"���ڶ�").start();
		new Thread(tw,"������").start();
		new Thread(tw,"������").start();

	}

}

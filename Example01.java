
public class Example01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow tw=new TicketWindow();
		new Thread(tw,"窗口一").start();
		new Thread(tw,"窗口二").start();
		new Thread(tw,"窗口三").start();
		new Thread(tw,"窗口四").start();

	}

}

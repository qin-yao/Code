
public class Example02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow02 tw=new TicketWindow02();
		new Thread(tw,"窗口一").start();
		new Thread(tw,"窗口二").start();
		new Thread(tw,"窗口三").start();
		new Thread(tw,"窗口四").start();

	}

}


public class TicketWindow01 extends Thread {
	int ticket=100;
	public void run(){
		while(true){
			if (ticket>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڷ����۵�"+ticket--+"��Ʊ");
			}
		}
	}

}

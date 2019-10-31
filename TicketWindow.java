
public class TicketWindow implements Runnable{
	public int ticket=10;
	public void run(){
		while(ticket>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---Âô³öµÄÆ±"+ticket--);
		}
	}

}

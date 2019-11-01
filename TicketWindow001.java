
public class TicketWindow001 implements Runnable{
	public int ticket=10;
	Object lock=new Object();
	public void run(){
		while(true){
			synchronized (lock){
				try{
					Thread.sleep(10);
			    }catch(InterruptedException e){
			    	e.printStackTrace();
			    }
				if(ticket>0){
					System.out.println(Thread.currentThread().getName()+"---Âô³öµÄÆ±"+ticket--);
				}else {
					break;
				}
	      }
       }
   }
}

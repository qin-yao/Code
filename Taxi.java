
public class Taxi implements Runnable{
	int t=100;
	public void run(){
		while(true){
			if(t>100){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"½ÓËÍµÚ"+t--+"³Ë¿Í");
			}
		}
	}

}

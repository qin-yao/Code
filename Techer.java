
public class Techer implements Runnable{
	private int notes=80;
	public void run(){
		while (true){
			if(notes>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڷ�"+notes--+"����ҵ");
			}
		}
		
	}

}

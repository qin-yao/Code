
public class MyRunnable implements Runnable {
	int i;
	public void run(){
		for (i=0;i<50;i++){
			System.out.println("new");
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int j;
		new Thread(new MyRunnable()).start();
		for(j=0;j<100;j++){
			System.out.println("main");
		}
	}

}

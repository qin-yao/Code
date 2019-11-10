
public class Input implements Runnable{
	private Storage st;
	private String num;
	Input(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.put( num);
		}
	}

}

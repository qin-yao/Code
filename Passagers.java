
public class Passagers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Taxi t=new Taxi();
		new Thread(t,"一号出租车").start();
		new Thread(t,"二号出租车").start();
		new Thread(t,"三号出租车").start();
		new Thread(t,"四号出租车").start();
		new Thread(t,"五号出租车").start();
	}

}


public class Passagers {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Taxi t=new Taxi();
		new Thread(t,"һ�ų��⳵").start();
		new Thread(t,"���ų��⳵").start();
		new Thread(t,"���ų��⳵").start();
		new Thread(t,"�ĺų��⳵").start();
		new Thread(t,"��ų��⳵").start();
	}

}

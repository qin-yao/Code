public class Example01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Storage st=new Storage();
		Input input=new Input(st);
		Output output =new Output(st);
		new Thread(input).start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		new Thread(output).start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
}

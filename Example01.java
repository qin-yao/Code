public class Example01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Storage st=new Storage();
		Input input=new Input(st);
		Output output =new Output(st);
		new Thread(input).start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		new Thread(output).start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}

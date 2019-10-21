package code1020;

	import java.util.Scanner;
public class Code05 {
	

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			Download file=new Download();
			Thread loading=new Thread(file);
			loading.start();
		}

	}


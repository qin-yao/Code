import java.util.*;

public class Storage {
	Random r=new Random();
	private String[] cells =new String[10];
	private int inpos,outpos,count;
	
	public void put(String num){
		num=String.valueOf(r.nextInt(100));
		cells[inpos]=num;
		count++;
		System.out.println("cells["+inpos+"]用户在登录,当前在线人数为："+count);
		inpos++;
		if(inpos==cells.length)
			inpos=0;
	}
	public void get(){
		Random r=new Random();
		//String  data=cells[outpos];
		//int count=cells.length;
		System.out.println("cells["+outpos+"]用户注销,当前在线人数为："+r.nextInt());
		outpos++;
		if(outpos==cells.length)
			outpos=0;
	}
}

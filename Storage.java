import java.util.*;

public class Storage {
	Random r=new Random();
	private String[] cells =new String[10];
	private int inpos,outpos,count;
	
	public void put(String num){
		num=String.valueOf(r.nextInt(100));
		cells[inpos]=num;
		count++;
		System.out.println("cells["+inpos+"]�û��ڵ�¼,��ǰ��������Ϊ��"+count);
		inpos++;
		if(inpos==cells.length)
			inpos=0;
	}
	public void get(){
		Random r=new Random();
		//String  data=cells[outpos];
		//int count=cells.length;
		System.out.println("cells["+outpos+"]�û�ע��,��ǰ��������Ϊ��"+r.nextInt());
		outpos++;
		if(outpos==cells.length)
			outpos=0;
	}
}

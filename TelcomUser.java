import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class TelcomUser {
	private String phoneNumber;
	private String calllTo;
	private LinkedList communicationRecords;
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new LinkedList();
		
	}
	void generateCommunicateRecord(){
		int recordNum=new Random().nextInt(10);
		for (int i=0;i<=recordNum;i++){
			long timeStart =System.currentTimeMillis()-new Random().nextInt(36000000);
			long timeEnd=timeStart+60000+new Random().nextInt(600000);
			 this.calllTo = getCallToPhoneNumber();
			this.communicationRecords.add(this.phoneNumber +
					","+timeStart+
					","+timeEnd+
					","+this.calllTo+
					";");
			
		}
		
	}
	private String getCallToPhoneNumber(){
		return "1380372"+String.valueOf(new Random().nextInt(10))
		     +String.valueOf(new Random().nextInt(10))
		     +String.valueOf(new Random().nextInt(10))
		     +String.valueOf(new Random().nextInt(10));
		
	}
	
	private String accountFee(long timeStart,long timeEnd){
		double feePerMinute = 0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
		
	}
	void printDetails(){
		/*ʹ��foreachѭ��*/
		for(Object aRecord:this.communicationRecords ){
			System.out.println("--------ͨ����¼�ָ���--------");
			String [] recordField = ((String)aRecord).split(",");
			System.out.println("���У�"+recordField[0]);
			System.out.println("���У�"+recordField[3]);
			Date timeStart=new Date(Long.parseLong(recordField[1]));
			Date timeEnd=new Date(Long.parseLong(recordField[2]));
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss��");
			System.out.println("ͨ����ʼʱ�䣺"+simpleDateFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺"+simpleDateFormat.format(timeEnd));
			System.out.println("�Ʒѣ�"
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"Ԫ");
		}
		
	}

}

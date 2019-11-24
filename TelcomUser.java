import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class TelcomUser {
	private String phoneNumber;
	private String calllTo;
	private ArrayList communicationRecords;
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
		
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
		int arrayListSize =this.communicationRecords.size();
		for(int i=0;i<=arrayListSize - 1;i++){
			String [] recordField = ((String) this.communicationRecords.get(i)).split(",");
			//DateFormat mediumFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			System.out.println("--------通话记录分割线--------");
			System.out.println("主叫："+recordField[0]);
			System.out.println("被叫："+recordField[3]);
			Date timeStart=new Date(Long.parseLong(recordField[1]));
			Date timeEnd=new Date(Long.parseLong(recordField[2]));
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
			System.out.println("通话开始时间："+simpleDateFormat.format(timeStart));
			System.out.println("通话结束时间："+simpleDateFormat.format(timeEnd));
			System.out.println("计费："
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"元");
		}
		
	}

}

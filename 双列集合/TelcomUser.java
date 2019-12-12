import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class TelcomUser {
	private String phoneNumber;
	private String calllTo;
	private ArrayList communicationRecords;
	private HashMap singleRecord;
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
			 this.singleRecord=new HashMap();
			 this.singleRecord.put("主叫", this.phoneNumber);
			 this.singleRecord.put("开始时间", new Date(timeStart));
			 this.singleRecord.put("结束时间", new Date(timeEnd));
			 this.singleRecord.put("被叫号码", this.calllTo);
			 this.singleRecord.put("计费", this.accountFee(timeStart, timeEnd));
			 this.communicationRecords.add(this.singleRecord);
			
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
		/*使用foreach循环*/
		Iterator itRecords = this.communicationRecords.iterator();
		
		while (itRecords.hasNext()){
			System.out.println("--------通话记录分割线--------");
			this.singleRecord=((HashMap)itRecords.next());
			Set entrySet = this.singleRecord.entrySet();
			Iterator inEntry = entrySet.iterator();
			while(inEntry.hasNext()){
				Map.Entry entry = (Map.Entry)inEntry.next();
				Object key = entry.getKey();
				Object value = entry.getValue();
				System.out.println(key + ":" + value);
			}
		}
		
	}

}

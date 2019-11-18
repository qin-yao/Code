package species;

import java.util.Date;
import java.util.Random;

public class LianTong extends sorts{
       
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	
	public LianTong (String phoneNumber){
		
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new StringBuffer();
	}
	//ģ��ͨ����¼������
	public void generateCommunicateRecord(){
       
	    	   //�������ͨ����¼��Ŀ
	    	  int recordNum=new Random().nextInt(20);
	    	  for(int i=0;i<=recordNum;i++){
	    		  //������ɵ�i��ͨ����¼
	    		  //��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
	    		  long timeStart=System.currentTimeMillis()-new Random().nextInt(10*24*60*60*1000);
	    		  //����ʱ�䣬��ʼ���ʮ�����������һ��ʱ�䣬����һ����
	    		  long timeEnd=timeStart+60000+new Random().nextInt(600000);
	    		  //���к���
	    		  this.callTo=this.getCallToPhoneNumber();
	    		  //����ͨ����¼
	    		  this.communicationRecords.append(this.phoneNumber+
	    				  ","+timeStart+","+timeEnd+","+this.callTo+";");
	    	  }
	      
		
	}
	//������ɱ������ŵĺ���
    private String getCallToPhoneNumber(){
  	  return "1551515"+String.valueOf(new Random().nextInt(10))
  	  +String.valueOf(new Random().nextInt(10))
  	  +String.valueOf(new Random().nextInt(10))
  	  +String.valueOf(new Random().nextInt(10));
  	  
    }
   //�Ʒ�
    private String accountFee(long timeStart,long timeEnd){
  	 
  	  double feePerMinute=0.8;
  	  
  	  int minutes=(int)Math.floor((timeEnd-timeStart)/60000);
  	  double feeTotal=feePerMinute*minutes;
  	  
  	  return String.format("%.2f", feeTotal);
    }
  //��ӡ�嵥
    public void printDetails(){
  	  //�����еļ�¼ת�����ַ����͵��������ͣ����ڷָ����һ��������Ϣ
  	 String allRecords=this.communicationRecords.toString();
  	 
  	 String[] recordArray=allRecords.split(";");
  	 
  	 for(int i=0;i<recordArray.length;i++){
  		 
  		 //System.out.println("message i"+recordArray[i]);
  		 String[] recordField=recordArray[i].split(",");
  		 
  		 System.out.println("---------------------------------------");
  		 System.out.println("���У�"+recordField[0]);
  		 System.out.println("���У�"+ recordField[3]);
  		 System.out.println("ͨ����ʼʱ�䣺"+new Date(Long.parseLong( recordField[1])));
  		 System.out.println("ͨ������ʱ��"+new Date(Long.parseLong(recordField[2])));
  		 System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
  		 +"Ԫ");
  		 
  		                
  	 }
  	  
    }
	
}

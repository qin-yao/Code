import java.util.Scanner;

public class Bank {
	int account;
	User user =new User();
	public void login(){
		DBUtils dbutil =DBUtils.getInstance();
		
		System.out.println("��ӭ������������ϵͳ");
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("�����뿨��");
			String cardId = in.nextLine();
			System.out.println("�������������룺");
			String cardPwd = in.nextLine();
			user = dbutil.getUser(cardId);
			
			if(dbutil.getUsers().containsKey(cardId)&&user.getCardPwd()
					.equals(cardPwd)){
				System.out.println("��¼�ɹ�����ӭ"+user.getUserName()+"����");
				break;
			}
			else{
				System.out.println("���п��Ż��������");
				continue;
			}
		}
	}
	public void operate(){
		Bank b = new Bank();
		while(true){
			System.out.println("��������Ҫ���еĲ������ͣ����س�������");
			System.out.println("�� 1" + "\t" + "ȡ� 2"+ "\t" +"���: 3" +"\t" + "�˳��� 4");
			Scanner in = new Scanner(System.in);
			String s =in.nextLine();
			if("1".equals(s)||"2".equals(s)){
				int num=0;
				try{
					System.out.println("�������ȡ�Ľ�");
				    num =Integer.parseInt(in.nextLine());
				}catch(Exception e){
				    System.out.println("������");
				    continue;
				}
				switch(s){
				case "1":
					b.income(num);
					break;
				case "2":
					b.outcome(num);
					break;
			    }
			}else if("3".equals(s)){
				b.show();
			}else if("0".equals(s)){
				System.out.println("�˳�ϵͳ");
				return ;
			}else{
				System.out.println("������0-3֮�������ѡ�����");
			}
		}

	}
	void income(int num){
		account=user.getAccount();
		account+=num;
	}
	void outcome(int num){
		account=user.getAccount()-num;
	}
	void show(){
		System.out.println("ʣ����Ϊ�� "+ account);
		
	}
	
	public static void main(String[] args){
		Bank b = new Bank();
		b.login();
		b.operate();
		
	}
	private void register(){
		User u =new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뿨��");
		u.setCardId(scanner.nextLine());
		System.out.println("�������û�����");
		u.setUserName(scanner.nextLine());
		System.out.println("���������룺");
		u.setCardPwd(scanner.nextLine());
		System.out.println("�������ֻ��ţ�");
		u.setCall(scanner.nextLine());
		System.out.println("������");
		u.setAccount(scanner.nextInt());
		DBUtils dbutils = DBUtils.getInstance();
		dbutils.addUser(u);
	}
	private void save(){
		DBUtils dbutil = DBUtils.getInstance();
		dbutil.update();
	}
}

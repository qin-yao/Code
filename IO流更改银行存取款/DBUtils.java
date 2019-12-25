import java.util.*;

public class DBUtils {
	private static DBUtils instance =null;
	private HashMap<String,User> users = new HashMap<String,User>();
	
	private DBUtils(){
		User user1 =new User();
		user1.setCardId("1001");
		user1.setCardPwd("123456");
		user1.setUserName("¡ı±∏");
		user1.setCall("13281525712");
		user1.setAccount(1000);
		users.put(user1.getCardId(), user1);
		
		User user2 =new User();
		user2.setCardId("1002");
		user2.setCardPwd("123456");
		user2.setUserName("’≈∑…");
		user2.setCall("13271525712");
		user2.setAccount(100);
		users.put(user2.getCardId(), user2);
		
		User user3 =new User();
		user3.setCardId("1003");
		user3.setCardPwd("123456");
		user3.setUserName("πÿ”");
		user3.setCall("13581525712");
		user3.setAccount(2000);
		users.put(user3.getCardId(), user3);
		
		
		getUsersFromInputStream("user.dat");
	}
	private void getUsersFromInputStream(String isName){
		fs = new FileInputStream(isName);
		byte [] content = new byte[1024];
		int i=0;
		int conInteger = 0;
		while(true){
			conInteger = fs.read();
			if(-1==conInteger){
				break;
			}else if('\r'==(char)conInteger||'\n'==(char)conInteger){
				this.processUserString (new String(content,"GBK").trim());
				i=0;	
			}
		}
	}
	public void processUserString(String userString){
		String [] userFields = userString.split(",");
		User u = new User();
		u.setCardId(userFields[0]);
		u.setCardPwd(userFields[1]);
		u.setUserName(userFields[2]);
		u.setCall(userFields[3]);
		u.setAccount(Integer.parseInt(userFields[4]));
		users.put(u.getCardId(), u);
	}
	
	public static DBUtils getInstance(){
			if(instance ==null){
				synchronized(DBUtils.class){
					if(instance == null){
						instance = new DBUtils();
					}
				}
			}
			return instance;
		}
	public User getUser(String cardId){
		User user = (User)users.get(cardId);
		return user;
	}
	
	public HashMap<String ,User> getUsers(){
		return users;
	}
	public void addUser(User u){
		users.put(u.getCardId(), u);
	}
	public void update(){
		Set<String> userSet = users.keySet();
		StringBuffer uStringBuffer = new StringBuffer();
		for(String cardId:userSet){
			User u = (User)users.get(cardId);
			String uString = u.getCardId()+","
					+u.getCardPwd()+","
					+u.getUserName()+","
					+u.getCall()+","
					+u.getAccount()+"\r\n";
			uStringBuffer.append(uString);
		}
		putUsersToFile(uStringBuffer.toString(),"user.dat");
	}
	private void putUsersToFile(String uString,String odName){
		fos = new FileOutputStream(osName);
		fos.write(uString.getBytes("GBK"));
		
	}
	
	

}

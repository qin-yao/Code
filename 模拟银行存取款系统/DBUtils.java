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
	
	

}

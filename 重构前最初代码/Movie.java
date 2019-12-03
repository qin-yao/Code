
public class Movie {
	public static final int CHILDRENS = 2;         //¶ùÍ¯Æ¬
	public static final int REGULAR = 0;           //ÆÕÍ¨Æ¬
	public static final int NEW_RELEASE = 1;       //ÐÂÆ¬
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title,int priceCode){
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode(){
		return _priceCode;
	}
	public void setPriceCode(int arg){
		_priceCode = arg;
	}
	public String getTitle(){
		return _title;
	}

}

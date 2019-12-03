
public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie,int daysRented){
		_movie = movie;
		_daysRented = daysRented;
	}
	public int getDaysRneted(){
		return _daysRented;
		
	}
	public Movie getMovie(){
		return _movie;
	}
	
	double getCharge (){
		  double  result=0;
		  switch(getMovie().getPriceCode()){
			case Movie.REGULAR:
				result +=2;
				if(getDaysRneted()>2)
					result+= (getDaysRneted() -2)*1.5;
				break;
			case Movie.NEW_RELEASE:
				result += getDaysRneted()*3;
				break;
			case Movie.CHILDRENS:
				result+=1.5;
				if(getDaysRneted() >3)
					result += (getDaysRneted() -3)*1.5;
				break;
			}
		  return result;
		  
	  }
	int getFrequentRenterPoints(){
		if((getMovie().getPriceCode()==Movie.NEW_RELEASE)
				&&getDaysRneted()>1)
				return 2;
		else return 1;
	}

}

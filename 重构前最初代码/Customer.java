import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer (String name){
		_name = name;
	}
	
	public void addRental(Rental arg){
		_rentals.addElement(arg);
	}
	public String getName(){
		return _name;
	}
	
	
	public String statement(){//�����굥
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result ="Rental Record for"+getName()+"\n";
		while (rentals.hasMoreElements()){
			double thisAmount = 0;
			Rental each = (Rental)rentals.nextElement();
			
			switch(each.getMovie().getPriceCode()){
			case Movie.REGULAR:
				result +=2;
				if(each.getDaysRneted()>2)
					result+= (each.getDaysRneted() -2)*1.5;
				break;
			case Movie.NEW_RELEASE:
				result += each.getDaysRneted()*3;
				break;
			case Movie.CHILDRENS:
				result+=1.5;
				if(each.getDaysRneted() >3)
					result += (each.getDaysRneted() -3)*1.5;
				break;
			}
			//
			frequentRenterPoints++;
			//
			if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)
				&&each.getDaysRneted()>1)
				frequentRenterPoints++;
			//
			result += "\t" +each.getMovie().getTitle()+"\t"+
				     String.valueOf(thisAmount)+"\n";
			totalAmount += thisAmount;
				
		}
		result +="Amount owed is" + String.valueOf(totalAmount) +"\n";
		result +="You earned "+ String.valueOf(frequentRenterPoints)+"frequent renter points";
		return result;

}
}

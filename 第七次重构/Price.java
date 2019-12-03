
abstract public class Price {
	abstract int getPriceCode();
}

class ChildrensPrice extends Price{
	int getPriceCode(){
		return Movie.CHILDRENS;
	}
}
class NewRealeasePrice extends Price{
	int getPriceCode(){
		return Movie.NEW_RELEASE;
	}
}
class RegularPrice extends Price{
	int getPriceCode(){
		return Movie.REGULAR;
	}
}



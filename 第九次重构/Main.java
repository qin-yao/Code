import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Movie movie1 = new Movie("Python�������",20);
		Movie movie2 = new Movie("java����",10);
		Movie movie3 = new Movie("C++������",20);
		Rental rental1 = new Rental(movie1,10);
		Rental rental2 = new Rental(movie2,2);
		Rental rental3 = new Rental(movie3,3);
		Customer customer = new Customer("����");
		customer.addRental(rental1);
		System.out.println(customer.statement());

	}

}

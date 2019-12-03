import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Movie movie1 = new Movie("Python基础设计",20);
		Movie movie2 = new Movie("java语言",10);
		Movie movie3 = new Movie("C++的意外",20);
		Rental rental1 = new Rental(movie1,10);
		Rental rental2 = new Rental(movie2,2);
		Rental rental3 = new Rental(movie3,3);
		Customer customer = new Customer("张四");
		customer.addRental(rental1);
		System.out.println(customer.statement());

	}

}

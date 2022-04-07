package Prototype;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Bookshop carturesti = Bookshop.loadDataFromDB("carturesti"); //new
		System.out.println(carturesti);
//		System.out.println("SHALLOW COPY");
//		Bookshop diverta = carturesti;
		System.out.println("DEEP COPY");
		Bookshop diverta = (Bookshop) carturesti.clone();
		diverta.getBooks().remove(3);
		System.out.println(carturesti);
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP NoteBook Model 100", 50000000));
		list.add(new Product(2, "TV", 320));
		list.add(new Product(3, "Washing Machine", 250));
		list.add(new Product(4, "Air Conditioner", 500));
		
		List<String> result = list.stream()
										.filter(p -> p.price > 5000000)
										.map(p->p.name)
										.collect(Collectors.toList());
		System.out.println(result);
		
	}

}

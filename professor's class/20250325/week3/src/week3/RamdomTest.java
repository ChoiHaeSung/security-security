package week3;
import java.util.*;
public class RamdomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 0; i<10; i++)
			System.out.print(random.nextInt(100)+",");
	}

}

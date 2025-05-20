import java.util.*;

public class Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"i", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}
}
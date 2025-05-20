import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExapmle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("입력데이터 ="+numbers);
		List<Integer> result =
				numbers.stream()
				.filter(n -> {
					return n % 2 ==0;
				})
				.map(n -> {
					return n*n;
					
				})
				.collect(Collectors.toList());
		System.out.println("실행결과 ="+result);
				
	}

}

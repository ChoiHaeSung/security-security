
import java.util.ArrayList; // ArrayList 클래스를 사용하기 위해 import 합니다.

public class Programming3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Point 객체의 리스트 대신 문자열(String) 객체를 저장하는 ArrayList를 생성합니다.
		ArrayList<String> list = new ArrayList<>();

		// 문자열 값을 리스트에 추가합니다.
		// 원래 코드에서 사용하려 했던 식별자들을 문자열로 변환하여 추가합니다.
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		// 리스트의 내용을 콘솔에 출력합니다.
		// ArrayList의 toString() 메소드는 리스트의 요소들을 [ ] 안에 콤마로 구분하여 출력합니다.
		System.out.println(list);
	}
}
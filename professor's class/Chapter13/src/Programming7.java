import java.util.*;

public class Programming7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("USA", "Washington");
		st.put("Japan", "Tokyo");
		st.put("China", "Beijing");
		st.put("UK", "London");
		st.put("Korea", "Seoul");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("국가 이름을 입력하시오:");
			String key = sc.next();
			if( key.equals("quit") ) break;
			System.out.println(key+"의 수도: " + st.get(key));
		}while(true);
	}

}
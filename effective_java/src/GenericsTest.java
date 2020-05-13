import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();
//		list.add("abc");						// 컴파일 오류 발생
		((ArrayList<String>)list).add("abc");	// 형 변환 시 가능
		
		System.out.println(list.get(0));
	}

}

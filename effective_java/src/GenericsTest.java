import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();
		// List<?> list = new ArrayList<?>();	// 불가능, 이렇게 쓸거면
		// List<?> list = new ArrayList<>();	// 차라리 이렇게나
		// List<?> list = new ArrayList();	// 이렇게 써야 함
		
//		list.add("abc");			// 컴파일 오류 발생
		((ArrayList<String>)list).add("abc");	// 형 변환 시 가능
		
		System.out.println(list.get(0));
	}

}

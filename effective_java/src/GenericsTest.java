import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();
//		list.add("abc");						// ������ ���� �߻�
		((ArrayList<String>)list).add("abc");	// �� ��ȯ �� ����
		
		System.out.println(list.get(0));
	}

}

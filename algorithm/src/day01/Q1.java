package day01;

public class Q1 {
	
    public int[] solution(int[] heights) {
    	
    	//heights�� ���� 2 �̻� 100 ������ ���� �迭�Դϴ�.
    	// ��� ž�� ���̴� 1 �̻� 100 �����Դϴ�.
        
    	int[] answer = new int[heights.length];
        int[] arrTop = new int[heights.length];
        System.arraycopy(heights, 0, arrTop, 0, heights.length);
        
        for(int i=heights.length-1 ; i>=0 ; i--) {
			for(int j=i ; j>=0 ; j--) { 
				if(arrTop[i] < arrTop[j]) {
					answer[i] = j+1;
					break;
					
				} else {
                    answer[i] = 0;
                }
			}
		}
        
        return answer;
    }
	
	
}

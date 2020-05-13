package day01;

public class Q1 {
	
    public int[] solution(int[] heights) {
    	
    	//heights는 길이 2 이상 100 이하인 정수 배열입니다.
    	// 모든 탑의 높이는 1 이상 100 이하입니다.
        
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

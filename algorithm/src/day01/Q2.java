package day01;

public class Q2 {
    static int num, count; //반복횟수를 알기 위한 전역변수
  
    public int[] solution(int n) {
        int[] temp = {0};
        num = n;
        count = 1;
        
        int[] answer = add(temp); //재귀 호출
        return answer;
    
    }

	static int[] add(int[] temp) {
	    if(num == count) return temp;
	
	    int[] answer = new int[2 * temp.length + 1];
	
	    for(int i = 0; i < answer.length; i++) {
	        if(i % 4 == 0) answer[i] = 0;
	        else if(i % 4 == 2) answer[i] = 1;
	        else answer[i] = temp[(i - 1) / 2];
	    }
	
	    count++;
	    return add(answer);
	}
	
}

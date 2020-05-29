import java.util.Stack;

public class Q3 {
	
	static class Solution {
	    public static int solution(String arrangement) {
	        int answer = 0;
	        
	        Stack st = new Stack<>();

	        String[] strArr = arrangement.split("");
	        
	        for(int i=0; i<strArr.length; i++) {
	        	// 1. ( 를 만나면 스택에 push
	        	if(strArr[i].equals("(")) {
	        		st.push(strArr[i]);
	        	} else if(strArr[i].equals(")")) {
	        		// 2. ) 일때 이 전이 (인지 확인
	        		// 2-1. 맞으면
	        		if(strArr[i-1].equals("(")) {
	        			st.pop();
	        			answer += st.size();
	        		} else {
	        			// 2-2. 아니면
	        			st.pop();
	        			answer += 1;
	        		}
	        	}
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution.solution("()(((()())(())()))(())");
	}

}

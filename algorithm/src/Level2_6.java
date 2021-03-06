
public class Level2_6 {
	
	public static String solution(int n) {
        String answer = "";
        int val = 0;
        
        while(n>0) {
        	val = n%3;
        	n /= 3;
        	if(val == 0) {
        		val = 4;
        		n --;
        	}
        	answer = val + answer;
        	// 1. answer = 4 + ""; = "4"
        	// 2. answer = 4 + "4"; = "44"
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Level2_6 level = new Level2_6();
		System.out.println(level.solution(12));
	}
}

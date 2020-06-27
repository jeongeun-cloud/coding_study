public class Level3_6 {
	// 직사각형 둘레 공식 (가로+세로)*2
	// 피보나치 1,1,2,3,5,8,13,21 ...
	public static long solution(int N) {
        long answer = 0;
        
        long[] arr = new long[N];
        arr[0] = 1;
        arr[1] = 1;
        
        for(int i=2; i<N; i++) {
        	arr[i] = arr[i-1]+arr[i-2];
        }
        
        long lastNum = arr[N-1] + arr[N-2];
        
        answer = (arr[N-1] + lastNum) *2;
        return answer;
    }
	
	public static void main(String[] args) {
		Level3_6 level = new Level3_6();
		System.out.println(level.solution(6));
	}
}

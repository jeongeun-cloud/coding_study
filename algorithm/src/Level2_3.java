import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_3 {
	
	public static class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        
	        Queue<Integer> q = new LinkedList();
	        
	        int x = 0;		// 몇번 째 진행중인지 배포 기준 변수
	        int cnt = 0; 	// 진행 완료된 개수(answer에 담길 개수) 변수
	        int proLen = progresses.length;
	        
	        // 1. 길이까지 돌면서
	        while(x < proLen) {
		        for(int i=0; i<proLen; i++) {
		        	// 2. 진도에 작업속도를 더한다.
		        	progresses[i] += speeds[i];
		        }
		        
	        	// 3. 100이 되었을 때
	        	if(progresses[x] >= 100) {
	        		// 3-1. 같이 나갈 숫자가 있는지?
	        		while(x < proLen && progresses[x] >=100) {
	        			cnt++;
	        			x++;
	        		}
	        		q.offer(cnt);
	        		cnt=0; // cnt초기화
	        	}
	        }
	        
	        answer = new int[q.size()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = q.poll();
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		System.out.println(Arrays.toString(s.solution(progresses, speeds)));
	}
}

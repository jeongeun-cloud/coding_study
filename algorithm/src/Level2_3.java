import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_3 {
	
	public static class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        
	        Queue<Integer> q = new LinkedList();
	        
	        int x = 0;		// ��� ° ���������� ���� ���� ����
	        int cnt = 0; 	// ���� �Ϸ�� ����(answer�� ��� ����) ����
	        int proLen = progresses.length;
	        
	        // 1. ���̱��� ���鼭
	        while(x < proLen) {
		        for(int i=0; i<proLen; i++) {
		        	// 2. ������ �۾��ӵ��� ���Ѵ�.
		        	progresses[i] += speeds[i];
		        }
		        
	        	// 3. 100�� �Ǿ��� ��
	        	if(progresses[x] >= 100) {
	        		// 3-1. ���� ���� ���ڰ� �ִ���?
	        		while(x < proLen && progresses[x] >=100) {
	        			cnt++;
	        			x++;
	        		}
	        		q.offer(cnt);
	        		cnt=0; // cnt�ʱ�ȭ
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

import java.util.Collections;
import java.util.PriorityQueue;

class Level2_4 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : priorities){
            pq.offer(x);
        }

        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
            	System.out.println(pq.peek());
                if(priorities[i] == (int)pq.peek()) {
                    pq.poll();
                    answer++;
                    if(location == i) {
                    	return answer;
                    }
                }
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
    	Level2_4 level = new Level2_4();
		int [] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(level.solution(priorities, location));
	}
}
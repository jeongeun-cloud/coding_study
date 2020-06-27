package day01;

class Level3_1 {
    static int number, count; 
    public int[] solution(int n) {
        int[] temp = {0};
        number = n;
        count = 1;

        int[] answer = add(temp); 
        return answer;
    }

    static int[] add(int[] temp) {
        if(number == count) return temp;

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
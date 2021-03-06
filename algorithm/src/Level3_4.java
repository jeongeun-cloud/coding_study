class Level3_4 {
	
    public int solution(int n) {
        int a = 1;
        int b = 2;
        int c;
        
        if(n < 3) return n;
        
        for(int i=3; i<=n; i++) {
            c = b;
            b = (a+b) % 1000000007;
            a = c;
        }
        
        return b;
    }
    
    public static void main(String[] args) {
    	Level3_4 level = new Level3_4();
		System.out.println(level.solution(4));
	}
}
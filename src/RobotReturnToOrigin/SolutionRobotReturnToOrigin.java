package RobotReturnToOrigin;

public class SolutionRobotReturnToOrigin {
	
	/*
	 * Running Time of this solution is O(N) where N is the number of moves
	 */
	public static boolean  judgeCircle(String moves) {
        int X = 0;
        int Y = 0;
        for(int i=0; i<moves.length() ;i++) {
        	if(moves.charAt(i) == 'L') {
        		X--;
        	}else if(moves.charAt(i) == 'R') {
        		X++;
        	}else if(moves.charAt(i) == 'U') {
        		Y++;
        	}else {
        		Y--;
        	}
        }
        if(X==0 && Y==0) {
        	return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		String moves = "UDLRRL";
		System.out.println(judgeCircle(moves));

	}

}

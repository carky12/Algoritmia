package game.dance;

public class Algoritmo {

	public static int getPositionAt(int number) {
		
		int nVal;
		int nValAnt;
		int nValAnt2;
		int nPos;
		int nPosAnt;
		
		
		if (number == 0) {
			nPos = 0;
			nVal = 0;
		} else if (number == 1) {
			nPos = 1;
			nVal = 1;
		} else if (number == 2) {
			nPos = -1;
			nVal = -2;
		} else {
			
			nValAnt = -2;
			nValAnt2 = 1;
			nPos = 0;
			nVal = 0;
			nPosAnt = -1;
			
			for (int i = 3; i <= number; i++) {	
				
				nVal = nValAnt - nValAnt2;
				nPos = nPosAnt + nVal;
				
				nValAnt2 = nValAnt;
				nValAnt = nVal;
				
				nPosAnt = nPos;				
			}
		}
		
		return nPos;
		
	}
}

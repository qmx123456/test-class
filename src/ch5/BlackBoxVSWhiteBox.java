package ch5;

public class BlackBoxVSWhiteBox {
	public int cal(float num) {
		int numI = (int)num;
		return numI*2;
	}
}

class BlackBoxVSWhiteBoxEccentric {
	public int cal(float num) {
		int numI = (int)Math.floor(num);
		numI--;
		return numI*2;
	}
}
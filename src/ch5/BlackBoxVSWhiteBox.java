package ch5;

public class BlackBoxVSWhiteBox {
	public int cal(float num) {
		int numI = (int)num;
		return numI*2;
	}
}

class BlackBoxVSWhiteBoxEccentricA {
	public int cal(float num) {
		int numI = (int)Math.ceil(num);
		if(numI > num) {
			numI--;
		}
		return numI*2;
	}
}
class BlackBoxVSWhiteBoxEccentricB {
	public int cal(float num) {
		int numI = (int)Math.round(num);
		if(numI > num) {
			numI--;
		}
		return numI*2;
	}
}
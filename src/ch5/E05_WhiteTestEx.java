package ch5;

public class E05_WhiteTestEx {

	public static int sum(int N, int Max) throws TooLargeException {
		int sum = 0 ;
		int k = 0;
		while(k<N) {//�޷������� && sum<=Max
			sum += k;
			k++;
		}
		if(sum > Max) {
			throw new TooLargeException("Error: too large");
		}
		return sum;
	}

}
class TooLargeException extends Exception{
	public TooLargeException(String mes) {
		super(mes);
	}
}
//TODO �����쳣������

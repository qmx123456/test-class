package ch5;

public class E05_WhiteTestEx {

	public static int sum(int N, int j) {
		int R = 0 ;
		int k = 0;
		while(k<=N) {
			R += k;
			k++;
		}
		return R;
	}

}
class TooLargeException extends Exception{
	public TooLargeException(String mes) {
		super(mes);
	}
}
//TODO ²âÊÔÒì³£µÄÄÚÈİ

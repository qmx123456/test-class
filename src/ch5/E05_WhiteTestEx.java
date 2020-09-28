package ch5;

public class E05_WhiteTestEx {

	public static int sum(int N, int Max) throws TooLargeException {
		int sum = 0 ;
		int k = 0;
		if(N<0) N = -1*N;
		//TDD,如果不能写出让测试失败的用例，那么就没有必要增加逻辑代码
		while(k<N) {//无法驱动出 && sum<=Max
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
//TODO 测试异常的内容

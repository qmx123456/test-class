package ch5;


public class E04_TriangleXP {
	public static E04_TriangleStyle tellStyle(double edgeA, double edgeB, double edgeC) {
		if (edgeA + edgeB > edgeC && edgeA + edgeC > edgeB && edgeB+edgeC>edgeA) {
			return E04_TriangleStyle.Irregular;
		}
		return E04_TriangleStyle.NotTriangle;
	}

	public static double verifyPositiveDouble(String string) {
		Double value = Double.valueOf(string);
		if(value <=0) {
			throw new NumberFormatException();
		}
		return value;
	}
}

enum E04_TriangleStyle {
	NotTriangle, Irregular, EqualTwoEdge
}
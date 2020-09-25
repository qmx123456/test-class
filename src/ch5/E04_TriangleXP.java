package ch5;

public class E04_TriangleXP {
	public static E04_TriangleStyle tellStyle(double edgeA, double edgeB, double edgeC) {
		if (edgeA + edgeB > edgeC && edgeA + edgeC > edgeB && edgeB+edgeC>edgeA) {
			return E04_TriangleStyle.Irregular;
		}
		return E04_TriangleStyle.NotTriangle;
	}

}

enum E04_TriangleStyle {
	NotTriangle, Irregular, EqualTwoEdge
}
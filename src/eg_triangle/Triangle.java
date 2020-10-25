package eg_triangle;

public class Triangle {

	public static TriangleType getType(int edgA, int edgeB, int edgeC) throws NotATriangleException {
		if(edgA+edgeB<=edgeC || edgA+edgeC<=edgeB || edgeB+edgeC<=edgA) {
			throw new NotATriangleException();
		}
		return TriangleType.irregular;
	}

}

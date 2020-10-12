package eg_triangle;

public class Triangle {

	public static TriangleType getType(int edgeA, int edgeB, int edgeC) throws NotATriangleException {
		if(edgeA+edgeB<=edgeC || edgeA+edgeC<=edgeB || edgeB+edgeC<=edgeA) {
			throw new NotATriangleException();
		}
		return TriangleType.irregular;
	}

}

package eg_triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void should_be_irregular_triangle_when_edge_is_2_3_4() throws NotATriangleException {
		TriangleType tt = Triangle.getType(2,3,4);
		assertEquals(TriangleType.irregular, tt);
	}
	
	@Test(expected = NotATriangleException.class)
	public void should_throw_exception_when_edges_is_2_3_5() throws NotATriangleException{
		Triangle.getType(2, 3, 5);
	}

	@Test(expected = NotATriangleException.class)
	public void should_throw_exception_when_edges_is_2_5_3() throws NotATriangleException{
		Triangle.getType(2, 5, 3);
	}
	
	@Test(expected = NotATriangleException.class)
	public void should_throw_exception_when_edges_is_5_2_3() throws NotATriangleException{
		Triangle.getType(5, 2, 3);
	}

}

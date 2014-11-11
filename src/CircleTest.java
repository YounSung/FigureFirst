import static org.junit.Assert.*;

import org.junit.Test;


public class CircleTest {

	
	Circle c;
	
	@Test
	public void testMeasureArea() {
		
		c = new Circle(5);
		assertTrue(c.measureArea()==(5*5*Math.PI));
		assertFalse(c.measureArea() == 5*5*3);
		
		c = new Circle(6);
		assertNotNull(c);
		assertTrue(c.measureArea()==(6*6*Math.PI));
//		fail("Not yet implemented");
	}

	@Test
	public void testMeasurePerimeter() {
		
		c = new Circle(4);
		assertTrue(c.measurePerimeter() == (2*4*Math.PI));
		
		c = new Circle(5);
		assertFalse(c.measurePerimeter() == (20));
//		fail("Not yet implemented");
	}

}

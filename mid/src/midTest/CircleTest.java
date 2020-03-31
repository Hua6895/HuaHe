package midTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mid.Circle;

public class CircleTest {

	@Test
	public void CircleTest() {
		Circle rec = new Circle(2);	
	
		assertEquals(12.56,rec.area(),0.01);
	}

}

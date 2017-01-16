package pk.ciit.MavenTest;
import static org.junit.Assert.*;

import org.junit.*;
public class CalcTest {
	private static Icalculator calc = new Calculator();
	
	@Test
	public void testAdd(){
		int result = calc.add(6, 2);
		assertEquals(result, 8);
	}
	

	

}

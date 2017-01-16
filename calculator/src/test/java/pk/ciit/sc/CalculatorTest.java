package pk.ciit.sc;
import junit.framework.TestCase;
import junit.*;
import junit.extensions.*;

public class CalculatorTest extends TestCase {
	public static Icalc calc;
	

	public void init(){
		calc=new Calculator();
		}
	
	public void before(){
		
		System.out.println("Before the Test");
		
	}
	
	
	public void after(){
		
		
		System.out.println("After the Process");
	}
	
	
	public void max(){
	int result = calc.findmax(3, 5, 7);
			
			assertEquals(8, result);
		
	}

	
	
	public void  Square(){
		
		int square=calc.square(2);
	
		
		assertEquals(4,square);
		
	}
	
public void  Cube(){
		
		int cube=calc.cube(3);
	
		
		assertEquals(27,cube);
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}

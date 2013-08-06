import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Test;


public class Practice_1Test {
	Practice_1 p1=new Practice_1();
	@Test
	public void x0() throws FileNotFoundException {
		assertTrue(p1.x0.isFile() && (p1.x0.equals(new File("./1/2.txt"))));
	}
	
	@Test
	public void x1() throws FileNotFoundException {
		assertTrue(p1.x1.isFile() && (p1.x1.equals(new File("./1/2.txt"))));
	}
	
	@Test
	public void x2() throws FileNotFoundException {
		assertTrue(p1.x2.isFile() && (p1.x2.equals(new File("./1/2.txt"))));
	}
	
	@Test
	public void x3() throws FileNotFoundException {
		assertTrue(p1.x3);
	}
}

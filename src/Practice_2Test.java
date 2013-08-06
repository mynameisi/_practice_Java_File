import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Test;

public class Practice_2Test {
	Practice_2 p2 = new Practice_2();
	File temp = new File("./1/2.txt");
	@Test
	public void x0() throws FileNotFoundException {
		assertTrue(p2.x0 == temp.canRead());
	}

	@Test
	public void x1() throws FileNotFoundException {
		assertTrue(p2.x1 == temp.canWrite());
	}

	@Test
	public void x2() throws FileNotFoundException {
		assertTrue(p2.x2 == temp.isDirectory());
	}

	@Test
	public void x3() throws FileNotFoundException {
		assertTrue(p2.x3 == temp.isDirectory());
	}

	@Test
	public void x4() throws FileNotFoundException {
		assertTrue(p2.x4 == temp.isFile());
	}

	@Test
	public void x5() throws FileNotFoundException {
		assertTrue(p2.x5 == temp.isFile());
	}
	@Test
	public void x6() throws FileNotFoundException {
		assertTrue(p2.x6 == temp.isHidden());
	}
	@Test
	public void x7() throws FileNotFoundException {
		assertTrue(p2.x7 == temp.isHidden());
	}

	@Test
	public void x8() throws FileNotFoundException {
		long remainingSpace = (new File("c:/").getFreeSpace()) / 1024 / 1024 / 1024;
		assertTrue(p2.x8 == remainingSpace);
	}

	@Test
	public void x9() throws FileNotFoundException {
		assertTrue(p2.x9.equals(temp.getName()));
	}
	@Test
	public void x10() throws FileNotFoundException {
		assertTrue(p2.x10.equals(temp.getParent()));
	}
	@Test
	public void x11() throws FileNotFoundException {
		assertTrue(p2.x11.equals(temp.getAbsolutePath()));
	}
	@Test
	public void x12() throws FileNotFoundException {
		assertTrue(p2.x12.equals(temp.getParentFile()));
	}
	@Test
	public void x13() throws FileNotFoundException {
		boolean result = true;
		File[] files = new File("./1").listFiles();
		for (int i = 0; i < files.length; i++) {
			result &= files[i].equals(Practice_2.x13.get(i));
		}
		assertTrue(result);
	}
	@Test
	public void x14() throws FileNotFoundException {
		assertTrue(p2.x14.length == new File("C:/WINDOWS/system32").listFiles().length);
	}

	@Test
	public void x15() throws FileNotFoundException {
		boolean result = (p2.x15 == new File("C:/").list().length);
		assertTrue(result);
		if (result) {
			System.out.println("测试x15: 你的C盘有" + p2.x15 + "个文件和文件夹");
		}
	}
}

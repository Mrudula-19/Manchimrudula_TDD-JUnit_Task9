package epam_projects_9.String;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Testcases
{
	@Test
	public void test1() {
		StringP sc = new StringP();
		String t1 = sc.character("BACD");
		assertEquals("BCD",t1);
	}
	@Test
	public void test2() {
		StringP sc = new StringP();
		String t2 = sc.character("ABCD");
		assertEquals("BCD",t2);
	}
	@Test
	public void test3() {
		StringP sc = new StringP();
		String t3 = sc.character("AACD");
		assertEquals("CD",t3);
	}
	@Test
	public void test4() {
		StringP sc = new StringP();
		String t4 = sc.character("AABBAA");
		assertEquals("BBAA",t4);
	}
	@Test
	public void test5() {
		StringP sc = new StringP();
		String t5 = sc.character("AAA");
		assertEquals("A",t5);
	}
	
}

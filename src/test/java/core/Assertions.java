package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assertions {

	Integer[] expected;
	Integer[] actual;
	
	@Test // @Ignore
	public void testAssertEquals() {
		String s ="ok";
		assertEquals("Failure - strings are not equal", "ok", s);}
	@Test //@Ignore
	public void testAsertFalse() {
		Boolean f = false;
		assertFalse("Failure - should be false", f);}
	@Test //@Ignore
	public void testAssertTrue() {
		Boolean t = true;
		assertTrue("Failure - should be true", t);}
	@Test //@Ignore
	public void testAssertArrayEquals() {
		assertArrayEquals("Failure - array not same", expected, actual);
		}
	@Test // @Ignore
	public void testAssertNotNull() {
		assertNotNull("Should not be null", new Object());
		}
	@Test // @Ignore
	public void testAssertNotSame() {
		assertNotSame("Should not be the same object", new Object(), new Object());
		}
	@Test // @Ignore
	public void testAssertNull() {
		assertNull("Should be null", null);
		}
	@Test // @Ignore
	public void testAssertSame() {
		Integer i = 5;
		assertSame("Should be same", 5, i);
		}
	}

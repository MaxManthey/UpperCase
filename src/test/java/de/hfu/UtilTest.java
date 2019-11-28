package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {
	@Test
	public void erstesHalbjahrTest() {
		final int eingabe = 3;
		assertTrue("Nicht erstes Halbjahr", Util.istErstesHalbjahr(eingabe));
	}
}

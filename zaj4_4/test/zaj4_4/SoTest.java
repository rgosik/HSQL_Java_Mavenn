package zaj4_4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zaj4_4.StringOperations;

import static org.assertj.core.api.Assertions.*;

public class SoTest {
	StringOperations soSample;
	
	@Before
	public void setUp(){		
		soSample = new StringOperations();
	}
	
	@Test
	public void testReverse(){
		assertThat(soSample.reverse("kappad")).contains("dappak");
	}
	@Test
	public void testReverse2(){
		assertThat(soSample.reverse(null)).isEqualTo(null);
	}
	@Test 
	public void testReverse3(){
		assertThat(soSample.reverse("traktor")).startsWith("rot")
	    .endsWith("kart");
	}
	@Test
	public void testConcat1(){
		assertThat(soSample.concat("kappa","dobre")).isEqualTo("kappadobre");
	}
	@Test
	public void testConcat2(){
		assertThat(soSample.concat(null,"dobre")).isEqualTo("dobre");
	}
	@Test
	public void testConcat3(){
		assertThat(soSample.concat("kre", null)).isEqualTo("kre");
	}
	@Test
	public void testConcat4(){
		assertThat(soSample.concat(null, null)).isEqualTo(null);
	}
	@Test
	public void testConcat5(){
		assertThat(soSample.concat("","")).isEqualTo("");
	}
	@Test
	public void testPalindrome(){
		assertThat(soSample.isPalindrome("aabcbaa")).isTrue();
	}
	
	@After
	public void tearDown(){
		soSample = null;
	}


}

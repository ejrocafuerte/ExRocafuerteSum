import static org.mockito.Mockito.spy;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

public class SumadorTest {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		int[] a={2,1};
		int[] b={3,2};
		Sumador s1 = spy(new Sumador());
		when(s1.convertidor("2,1")).thenReturn(a);
		when(s1.convertidor("3,2")).thenReturn(b);
		
		assertEquals(s1.Suma("2,3"),5);
		
		
	 }
}

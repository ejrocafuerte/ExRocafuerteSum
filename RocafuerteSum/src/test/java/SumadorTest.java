import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class SumadorTest {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		Sumado s2 = spy(new Sumado());
		int []b={3,2};
		
		when(s2.convertidor("3,2")).thenReturn(b);
	
		assertEquals(5,s2.Suma("3,2"));
	 }
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Sumado s2 = spy(new Sumado());
		int []b={3,0};
		
		when(s2.convertidor("3")).thenReturn(b);
	
		assertEquals(3, s2.Suma("3"));
	}

	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Sumado s2 = spy(new Sumado());
		int []b={3,6};
		
		when(s2.convertidor("3,6")).thenReturn(b);
	
		
		assertEquals(3+6, s2.Suma("3,6"));
	}
	
}

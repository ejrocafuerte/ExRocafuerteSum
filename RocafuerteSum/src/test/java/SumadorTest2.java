import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


public class SumadorTest2 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		Sumador s1 = spy(new Sumador());
		
	 }
}
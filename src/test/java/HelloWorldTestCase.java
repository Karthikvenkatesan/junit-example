import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTestCase 
{

	@Test
	public final void test() 
	{
		HelloWorld helloWorld = new HelloWorld();
		String strTo = "Karthik";
		String strAct = helloWorld.sayHello(strTo);
		String strExp = "Hello Mr. " + strTo; 
		
		assertEquals(strExp, strAct);
	}

}

public class HelloWorld 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HelloWorld helloWorld = new HelloWorld();
		String strRet = helloWorld.sayHello("Karthik");
		System.out.println("Str Ret = "+ strRet);
		// asdf
	}
	
	public String sayHello(String strTo) 
	{
		String strRet = "Hello Mr. " + strTo; 
		return strRet;		
	}
}
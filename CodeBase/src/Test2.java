import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Test3
{
	try
	{
	tryThis();
	return;
	}
	catch(IOException x1)
	{
	System.out.println("exception 1 ");
	return;
	}
	catch(Exception x2)
	{ 
	System.out.println("exception 2");
	return;

	}
	finally
	{

	System.out.println("finally");

	}
	private void tryThis() 
	{
		// TODO Auto-generated method stub
		
	}
}
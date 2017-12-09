package es.esy.playdotv;

import es.esy.playdotv.objects.Paper;

import java.io.IOException;
import java.util.Map;

public class DumpBooksTester
{
	public static void printAllBooks()
	throws ClassNotFoundException, IOException
	{
		Map<String, Paper> papers = SebuLink.load("papers.ser");
		
		for (String key : papers.keySet())
		{
			Paper p = papers.get(key);
			System.out.printf("%s : %s - %s\n", p.getID(), p.getAuthor(), p.getTitle());
			
		}
	}
}

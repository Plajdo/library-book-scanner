package com.github.plasmoxy.database;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import es.esy.playdotv.objects.Book;
import es.esy.playdotv.objects.Paper;

public class TestLink
{
	public static void main(String[] args)
	throws IOException, ClassNotFoundException
	{
		/*
		Book b = new Book("34");
		b.setTitle("XD");
		Map<String, Paper> map = new HashMap<String, Paper>();
		map.put("34", b);
		SebuLink.push("books.ser", map);
		*/
		
		Map<String, Paper> books = SebuLink.pop("books.ser");
		Paper p = books.get("34");
		System.out.println(p.getTitle());
	}
}
